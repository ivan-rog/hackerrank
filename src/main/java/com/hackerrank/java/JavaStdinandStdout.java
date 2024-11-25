package com.hackerrank.java;

import java.io.*;

public class JavaStdinandStdout {

    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));
        var write = new BufferedWriter(new OutputStreamWriter(System.out));
        write.append(reader.readLine());
        write.newLine();
        write.append(reader.readLine());
        write.newLine();
        write.append(reader.readLine());
        write.newLine();
        write.flush();
        reader.close();
        write.close();
    }
}
