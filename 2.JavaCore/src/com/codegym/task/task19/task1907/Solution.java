package com.codegym.task.task19.task1907;

/* 
Counting words

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws  Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader f = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        int counter = 0;

        while (f.ready()) {
            String line = f.readLine();
            String l[] = line.split("\\W"); // \\W means all non-word characters
            for (String word : l) {
                if ("world".equals(word.toLowerCase())) {
                    counter++;
                }
            }
        }
        f.close();
        System.out.println(counter);
    }
}
