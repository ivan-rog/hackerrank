package com.hackerrank.algorithms;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class ComparetheTriplets {

    private static BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        List<Integer> a = Stream.of(reader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(reader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        writer.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        reader.close();
        writer.close();
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        var alices = 0;
        var bobs = 0;
        for (int i = 0; i < 3; i++) {
            if(a.get(i) > b.get(i))
                alices++;
            else if(a.get(i) < b.get(i))
                bobs++;
        }
        return List.of(alices, bobs);
    }
}
