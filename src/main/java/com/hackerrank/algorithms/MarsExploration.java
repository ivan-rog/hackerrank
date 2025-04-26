package com.hackerrank.algorithms;

import java.io.*;

public class MarsExploration {

    private static final String SOS_SIGNAL = "SOS";

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String input = br.readLine().trim();
            int changedSignals = countChangedSignals(input);
            bw.write(String.valueOf(changedSignals));
            bw.newLine();
        }
    }

    private static int countChangedSignals(String message) {
        int alterations = 0;
        for (int i = 0; i < message.length(); i++) {
            char expectedChar = SOS_SIGNAL.charAt(i % SOS_SIGNAL.length());
            if (message.charAt(i) != expectedChar) {
                alterations++;
            }
        }
        return alterations;
    }
}
