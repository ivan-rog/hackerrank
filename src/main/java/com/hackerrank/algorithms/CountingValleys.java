package com.hackerrank.algorithms;

import java.io.*;

public class CountingValleys {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int steps = Integer.parseInt(br.readLine().trim());
            String path = br.readLine().trim();
            int height = 0;
            int valleys = 0;
            for (char c : path.toCharArray()) {
                if (c == 'U') {
                    height++;
                    if (height == 0) {
                        valleys++;
                    }
                } else {
                    height--;
                }
            }
            bw.write(String.valueOf(valleys));
            bw.newLine();
        }
    }
}
