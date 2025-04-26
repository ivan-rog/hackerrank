package com.hackerrank.algorithms;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class TwoArray {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            short q = Short.parseShort(br.readLine().trim());
            while (q-- > 0) {
                String[] nkInput = br.readLine().trim().split(" ");
                short n = Short.parseShort(nkInput[0]);
                int k = Integer.parseInt(nkInput[1]);
                int[] a = Arrays.stream(br.readLine().trim().split(" ")).
                        mapToInt(Integer::parseInt).sorted().toArray();
                int[] b = Arrays.stream(br.readLine().trim().split(" ")).
                        mapToInt(Integer::parseInt).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
                bw.write(compare(a, b, n, k));
                bw.newLine();
            }

        }
    }

    private static String compare(int[] a, int[] b, short n, int k) {
        return IntStream.range(0, n)
                .allMatch(i -> a[i] + b[i] >= k) ? "YES" : "NO";

    }
}