package com.hackerrank.algorithms;

import java.io.*;

public class TimeConversion {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String hour = reader.readLine();
        String result = timeConversion(hour);
        writer.write(result);
        writer.newLine();
        writer.flush();
        writer.close();
        reader.close();
    }

    public static String timeConversion(String s) {
        var result = new StringBuilder(s);
        if (result.indexOf("AM") > 0 && "12".equals(result.substring(0, 2))) {
            result.replace(0, 2, "00");
        }
        if (result.indexOf("PM") > 0 && result.indexOf("12") < 0) {
            result.replace(0, 2, String.valueOf(Integer.valueOf(result.substring(0, 2)) + 12));
        }
        return result.substring(0, result.length() - 2);
    }
}
