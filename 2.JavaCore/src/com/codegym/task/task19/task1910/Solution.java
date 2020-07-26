package com.codegym.task.task19.task1910;

/* 
Punctuation

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader f1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter f2 = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();

        while (f1.ready()) {
            String line = f1.readLine();
            f2.write(line.replaceAll("[^a-zA-Z ]", ""));
        }

        f1.close(); f2.close();
    }
}
