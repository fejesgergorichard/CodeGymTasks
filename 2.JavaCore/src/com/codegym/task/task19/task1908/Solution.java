package com.codegym.task.task19.task1908;

/* 
Picking out numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cons = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(cons.readLine()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(cons.readLine()));
        cons.close();

        StringBuilder sb = new StringBuilder();

        while (reader.ready()) {
            String line = reader.readLine();
            String words[] = line.split("\\s");
            for (String word : words) {
                if (isDigit(word)) {
                    sb.append(word);
                    sb.append(" ");
                }
            }
        }
        reader.close();
        sb.deleteCharAt(sb.length()-1);
        writer.write(sb.toString());
        writer.close();
    }

    /** Determines if a string is numerical or not */
    public static boolean isDigit(String s) {
        try {
            int a = Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
