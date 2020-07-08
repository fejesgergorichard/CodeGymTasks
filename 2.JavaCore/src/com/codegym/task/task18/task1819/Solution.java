package com.codegym.task.task18.task1819;

/* 
Combining files

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream fis1 = new FileInputStream(file1);
        FileInputStream fis2 = new FileInputStream(file2);

        byte[] f1c = new byte[fis1.available()];
        int i = 0;
        while (fis1.available() > 0) {
            f1c[i] = (byte)fis1.read();
            i++;
        }
        fis1.close();

        FileOutputStream fos = new FileOutputStream(file1, false);
        while (fis2.available() > 0) {
            fos.write(fis2.read());
        }
        fos.write(f1c);


        fis2.close();
        fos.close();
    }
}
