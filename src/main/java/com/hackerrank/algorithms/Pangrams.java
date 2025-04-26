package com.hackerrank.algorithms;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class Pangrams {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write(isPangram(br.readLine()));
        }
    }

    private static String isPangram(String s) {
        Set<Character> alphabet = new TreeSet<>();
        s.toLowerCase()
                .chars()
                .mapToObj(i -> (char) i)
                .filter(Character::isLetter)
                .forEach(c -> alphabet.add((char) c));
        return alphabet.size() == 26 ? "pangram" : "not pangram";
    }
}
