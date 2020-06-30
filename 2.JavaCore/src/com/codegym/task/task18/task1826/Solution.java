package com.codegym.task.task18.task1826;

/* 
Encryption

*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String mode = args[0];
        String fileName = args[1];
        String fileOutputName = args[2];

        FileInputStream fis = new FileInputStream(fileName);
        FileOutputStream fos = new FileOutputStream(fileOutputName);

        switch (mode) {
            case "-e":
                while (fis.available() > 0) {
                    fos.write(fis.read() + 100);
                }
                break;


            case "-d":
                while (fis.available() > 0) {
                    fos.write(fis.read() - 100);
                }
                break;
        }

        fis.close();
        fos.close();

    }
}