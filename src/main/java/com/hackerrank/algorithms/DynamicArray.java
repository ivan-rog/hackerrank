package com.hackerrank.algorithms;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class DynamicArray {

    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = dynamicArray(n, queries);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>> result = new ArrayList<>(n);
        List<Integer> store = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(new ArrayList<>());
        }
        int lastAnswer = 0;
        for (List<Integer> query : queries) {
            int index = (query.get(1) ^ lastAnswer) % n;
            switch (query.get(0)) {
                case 1:
                    result.get(index).add(query.get(2));
                    break;
                case 2:
                    int indey = query.get(2) % result.get(index).size();
                    lastAnswer = result.get(index).get(indey);
                    store.add(lastAnswer);
                    break;
            }
        }
        return store;
    }

}
