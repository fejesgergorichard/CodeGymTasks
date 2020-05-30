package com.codegym.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Sorting bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        FileInputStream stream = new FileInputStream(file);

        ArrayList<Byte> list = new ArrayList<>();

        Byte newData;
        while (stream.available() != 0) {
           newData = (byte) stream.read();
           if (list.contains(newData)) continue;
           list.add(newData);
        }
        stream.close();


        Collections.sort(list);
        for (Byte element : list) {
            System.out.print(element + " ");
        }
    }
}
