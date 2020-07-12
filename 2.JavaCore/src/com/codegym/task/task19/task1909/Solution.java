package com.codegym.task.task19.task1909;

/* 
Changing punctuation marks

*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f1 = reader.readLine();
        String f2 = reader.readLine();
        reader.close();

        BufferedReader fis = new BufferedReader(new FileReader(f1));
        //FileInputStream fis = new FileInputStream(f1);
        BufferedWriter fos = new BufferedWriter(new FileWriter(f2));
        //FileOutputStream fos = new FileOutputStream(f2);

        while (fis.ready()) {
            int current = fis.read();
            if ((char) current == '.') fos.write((int)'!');
            else fos.write(current);
        }

        fis.close();
        fos.close();

    }
}
