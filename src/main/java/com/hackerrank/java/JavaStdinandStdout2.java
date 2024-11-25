package com.hackerrank.java;

import java.io.*;

public class JavaStdinandStdout2 {

    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));
        var write = new BufferedWriter(new OutputStreamWriter(System.out));
        int i = Integer.valueOf(reader.readLine());
        double d = Double.valueOf(reader.readLine());
        String s = reader.readLine();
        write.append("String: " + s);
        write.newLine();
        write.append("Double: " + d);
        write.newLine();
        write.append("Int: " + i);
        write.newLine();
        write.flush();
        reader.close();
        write.close();
    }
}
