package com.hackerrank.algorithms;

import java.io.*;
import java.util.Arrays;

public class CountingSort1 {

    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n  = Integer.parseInt(br.readLine().trim());
            int[] arr = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
            int [] count = new int[100];
            for (int i = 0; i < n; i++) {
                count[arr[i]]++;
            }
            for (int i = 0; i < 100; i++) {
                bw.write(String.valueOf(count[i]));
                if (i < n - 1) {
                    bw.write(" ");
                }
            }
            bw.newLine();
        }
    }
}
