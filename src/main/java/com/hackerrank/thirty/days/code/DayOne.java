package com.hackerrank.thirty.days.code;

import java.io.*;

public class DayOne {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int i = Integer.valueOf(br.readLine());
        double d = Double.valueOf(br.readLine());
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        sb.append(i + 4).append("\n").
                append(String.format("%.1f", d + 4f)).append("\n").
                append("HackerRank ").append(s).append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
