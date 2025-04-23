package com.hackerrank.algorithms;

import java.io.*;

public class KitFlippingBits {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            short q = Short.parseShort(br.readLine().trim());
            for (short i = 0; i < q; i++) {
                int n = Integer.parseInt(br.readLine().trim());
                long flipped = ~n;
                bw.write(String.valueOf(flipped));
                bw.newLine();
            }
        }
    }
}
