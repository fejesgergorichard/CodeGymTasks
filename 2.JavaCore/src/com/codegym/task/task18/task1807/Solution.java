package com.codegym.task.task18.task1807;

/* 
Counting commas

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        int count = 0;
        FileInputStream stream = new FileInputStream(filename);
        while (stream.available() > 0) {
            int current = stream.read(); // read the current byte
            if (current == 44) count++;
        }
        stream.close();

        System.out.println(count);

    }
}
