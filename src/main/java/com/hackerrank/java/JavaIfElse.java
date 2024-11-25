package com.hackerrank.java;

import java.io.*;

public class JavaIfElse {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.valueOf(br.readLine());
        bw.append(weird(n));
        bw.newLine();
        bw.flush();
        br.close();
        bw.close();
    }

    private static String weird(int n) {
        return (n & 1) == 1 ? "Weird" : (n >= 2 && n <= 5) ? "Not Weird" : (n >= 6 && n <= 20) ? "Weird" : "Not Weird";
    }
}
