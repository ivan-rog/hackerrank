package com.hackerrank.algorithms;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class SimpleArraySum {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int arCount = Integer.parseInt(reader.readLine().trim());

        List<Integer> ar = Stream.of(reader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = simpleArraySum(ar);

        writer.write(String.valueOf(result));
        writer.newLine();

        reader.close();
        reader.close();
    }

    public static int simpleArraySum(List<Integer> ar) {
        return ar.stream().reduce(0, Integer::sum);
    }
}

