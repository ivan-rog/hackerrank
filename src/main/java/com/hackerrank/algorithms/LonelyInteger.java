package com.hackerrank.algorithms;

import java.io.*;
import java.util.Arrays;

public class LonelyInteger {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.valueOf(br.readLine());
        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int unique = 0;
        for (int i = 0; i < n; i++) {
            unique ^= array[i];
        }
        bw.write(unique + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
