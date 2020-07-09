package com.codegym.task.task18.task1821;
/*
Symbol frequency

*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String filename = args[0];
        FileInputStream inputStream = new FileInputStream(filename);

        HashMap<Integer, Integer> map = new HashMap<>();

        while (inputStream.available() > 0) {
            int current = inputStream.read();
            if (map.containsKey(current)) map.replace(current, map.get(current) + 1);
            else map.put(current, 1);
        }

        TreeSet<Integer> keys = new TreeSet<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            keys.add(entry.getKey());
        }

        for (Integer val : keys) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getKey() == val) {
                    String current;
                    current = Character.toString((char)((int)entry.getKey()));
                    current += " " + entry.getValue().toString();
                    System.out.println(current);
                }
            }
        }
        inputStream.close();
    }
}
