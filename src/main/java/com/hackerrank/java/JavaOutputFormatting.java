package com.hackerrank.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaOutputFormatting {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[][] lines = new String[3][2];
        for (int i = 0; i < 3; i++) {
            lines[i] = reader.readLine().split(" ");
        }
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s%03d\n", lines[i][0], Integer.valueOf(lines[i][1]));
        }
        System.out.println("================================");
        reader.close();
    }

}
