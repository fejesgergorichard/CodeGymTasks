package com.codegym.task.task18.task1816;

/* 
ABCs

*/

import javax.imageio.stream.FileCacheImageInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file = args[0];
        int num = 0;
        FileInputStream fis = new FileInputStream(file);

        while (fis.available() > 0) {
            int curr = fis.read();
            if ((curr >= 65 && curr <= 90) || (curr >=97 && curr <= 122)) num++;
        }

        System.out.println(num);
        fis.close();
    }
}
