package com.hackerrank.thirty.days.code;

import java.io.*;

public class DayZero {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String line = br.readLine();
        bw.write("Hello, World.");
        bw.newLine();
        bw.write(line);
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}
