package com.codegym.task.task18.task1804;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Rarest bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();

        FileInputStream stream = new FileInputStream(file);

        // we store each byte's count in a hashmap
        HashMap<Integer, Integer> map = new HashMap<>();
        int temp, val, newValue;
        while (stream.available() > 0) {
            temp = stream.read();
            if (!map.containsKey(temp)) {
                map.put(temp, 1);
            } else {
                val = map.get(temp).intValue();
                newValue = (Integer) val + 1;
                map.replace(temp, newValue);
            }
        }
        // close the file stream
        stream.close();


        // get the minimum value
        int minimum = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() <= minimum) {
                minimum = entry.getValue();
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (Integer.compare(entry.getValue(), minimum ) == 0) {
                System.out.print(entry.getKey() + " ");
            }
        }

    }
}
