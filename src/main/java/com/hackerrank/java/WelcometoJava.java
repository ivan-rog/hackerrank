package com.hackerrank.java;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WelcometoJava {

    public static void main(String[] args) throws IOException {
        var write = new BufferedWriter(new OutputStreamWriter(System.out));
        write.append("Hello, World.");
        write.newLine();
        write.append("Hello, Java.");
        write.newLine();
        write.flush();
        write.close();
    }
}
