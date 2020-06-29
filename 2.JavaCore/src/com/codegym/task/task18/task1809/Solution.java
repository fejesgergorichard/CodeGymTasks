package com.codegym.task.task18.task1809;

/* 
Reversing a file

*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // initialize the fileinputstream and the fileoutputstream
        String f1 = reader.readLine();
        String f2 = reader.readLine();

        FileInputStream fis = new FileInputStream(f1);
        FileOutputStream fos = new FileOutputStream(f2);

        ArrayList<Integer> bytes = new ArrayList<>();

        // read all available bytes from f1
        while (fis.available() > 0) {
            bytes.add(fis.read());
        }

        // close the input stream
        fis.close();

        // reverse the order of the bytes
        Collections.reverse(bytes);

        // write the ints in the arraylist to f2
        for (Integer i : bytes) {
            fos.write(i);
        }

        // Close the stream
        fos.close();

    }
}
