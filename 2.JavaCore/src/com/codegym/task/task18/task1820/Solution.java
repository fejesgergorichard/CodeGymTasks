package com.codegym.task.task18.task1820;

/* 
Rounding numbers

*/

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) throws Exception {
        // create the streams
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        BufferedReader fis = new BufferedReader(new FileReader(file1));
        FileOutputStream fos = new FileOutputStream(file2);

        // read the contents of file1 to an arraylist and close
        ArrayList<String> fisContent = new ArrayList<>();
        while (fis.ready()) {
            fisContent.add(fis.readLine());
        }
        fis.close();

        // go through all the lines in file1
        StringBuilder sb = new StringBuilder();
        for (String line : fisContent) {
            String[] nums = line.split(" ");
            //// go through all the numbers in all the lines
            for (String s : nums) {
                float d = Float.parseFloat(s);
                int result = Math.round(d);
                sb.append(result + " ");
            }
        }

        // remove the last space
        sb.deleteCharAt(sb.length() - 1);
        // Write each element in the stringbuilder to the output file
        for (char x : sb.toString().toCharArray()) {
            fos.write(x);
        }

        fos.close();

    }
}
