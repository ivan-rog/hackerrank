package com.hackerrank.algorithms;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class TwoDArrayDS {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        List<List<Integer>> arr = new ArrayList<>();
        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(Stream.of(reader.readLine().split(" ")).map(Integer::parseInt).collect(toList()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        var result = hourglassSum(arr);
        bw.write(Integer.toString(result));
        bw.newLine();
        bw.flush();
        reader.close();
        bw.close();
    }

    public static int hourglassSum(List<List<Integer>> arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int result = sumArray(arr, i, j);
                maxSum = Math.max(maxSum, result);
            }
        }
        return maxSum;
    }

    private static int sumArray(List<List<Integer>> arr, int i, int j) {
        return arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
                + arr.get(i + 1).get(j + 1) +
                arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
    }
}
