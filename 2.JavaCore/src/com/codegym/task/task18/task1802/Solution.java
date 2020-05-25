package com.codegym.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Minimum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);

        long min = Long.MAX_VALUE;
        int data;
        while(inputStream.available() > 0) {
            data = inputStream.read();
            if (data < min) min = data;
        }
        System.out.println(min);
        inputStream.close();
    }
}
