package com.codegym.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Maximum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        int max = 0;
        int data;

        FileInputStream fileInputStream = new FileInputStream(filename);
        while (fileInputStream.available() > 0) {
            data = fileInputStream.read();
            max = (data > max) ? data : max;
        }
        fileInputStream.close();
        System.out.println(max);

    }
}
