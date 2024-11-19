package com.hackerrank.algorithms;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class DiagonalDifference {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(br.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bw.write(String.valueOf(result));
        bw.newLine();

        br.close();
        bw.close();
    }
}

class Result {

    public static int diagonalDifference(List<List<Integer>> arr) {
        var size = arr.size();
        var result = 0;
        for (int i = 0; i < size; i++) {
            result += arr.get(i).get(i) - arr.get(i).get(size - 1 - i);
        }
        return result > 0 ? result : -result;
    }


}
