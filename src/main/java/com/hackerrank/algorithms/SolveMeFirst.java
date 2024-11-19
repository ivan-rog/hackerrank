package com.hackerrank.algorithms;

import java.io.*;

public class SolveMeFirst {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int a = Integer.valueOf(reader.readLine());
        int b = Integer.valueOf(reader.readLine());
        int sum = solveMeFirst(a, b);
        writer.write(Integer.toString(sum));
        writer.newLine();
        writer.flush();
        reader.close();
        writer.close();
    }

    static int solveMeFirst(int a, int b) {
        return a + b;
    }
}
