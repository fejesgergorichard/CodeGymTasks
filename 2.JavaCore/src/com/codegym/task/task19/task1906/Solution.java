package com.codegym.task.task19.task1906;

/* 
Even characters

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f1 = reader.readLine();
        String f2 = reader.readLine();
        reader.close();

        FileReader r = new FileReader(f1);
        FileWriter w = new FileWriter(f2);

        int i = 1;
        while (r.ready()) {
            int c = r.read();
            if (i % 2 == 0) w.write(c);
            i++;
        }

        r.close();
        w.close();

    }
}
