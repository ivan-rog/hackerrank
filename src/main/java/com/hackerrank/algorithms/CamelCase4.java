package com.hackerrank.algorithms;

import java.io.*;

public class CamelCase4 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        while (br.ready()) {
            var line = br.readLine().split(";");
            bw.write(processByType(line));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }

    private static String processByType(String[] line) {
        var operation = line[0];
        var type = line[1];
        switch (type) {
            case "M":
                return "S".equals(operation) ? splitMethod(line[2]): combinationMethod(line[2]);
            case "C":
                return "S".equals(operation) ? splitClass(line[2]): combinationClass(line[2]);
            case "V":
                return "S".equals(operation) ? splitVariable(line[2]): combinationVariable(line[2]);
            default:
                return "";
        }
    }

    private static String combinationMethod(String s) {
        var result = combinationProcess(s.toCharArray());
        return result.append("()").toString();
    }

    private static String combinationVariable(String s) {
        var result = combinationProcess(s.toCharArray());
        return result.toString();
    }

    private static String combinationClass(String s) {
        var chars = s.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        var result = combinationProcess(chars);
        return result.toString();
    }

    private static StringBuilder combinationProcess(char[] s) {
        var result = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            if (Character.isSpaceChar(s[i])) {
                result.append(Character.toUpperCase(s[++i]));
            } else {
                result.append(s[i]);
            }
        }
        return result;
    }

    private static String splitMethod(String s) {
        var result = splitProcess(s.substring(0, s.length() - 2).toCharArray());
        return result.toString();
    }

    private static String splitClass(String s) {
        var result = splitProcess(s.toCharArray());
        return result.substring(1, result.length());
    }

    private static String splitVariable(String s) {
        return splitProcess(s.toCharArray());
    }

    private static String splitProcess(char[] s) {
        var result = new StringBuilder();
        for (char c : s) {
            if (Character.isUpperCase(c)) {
                result.append(" ").append(Character.toLowerCase(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

}
