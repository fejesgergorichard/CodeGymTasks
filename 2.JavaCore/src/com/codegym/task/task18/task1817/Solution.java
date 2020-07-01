package com.codegym.task.task18.task1817;

/* 
Spaces

*/

import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args) throws Exception {
        String file = args[0];

        FileInputStream fis = new FileInputStream(file);

        int allChars = 0;
        int spaces = 0;

        while (fis.available() > 0) {
            if (fis.read() == 32) spaces++;
            allChars++;
        }

        fis.close();

        double result = (double) spaces / allChars * 100;
        System.out.println(Math.round(result*100.0) / 100.0);
    }
}
