package com.codegym.task.task18.task1822;

/* 
Finding data inside a file

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int id = Integer.parseInt(args[0]);
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String file = "";
        try {
            file = consoleReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader fileReader = null;
        try {
            fileReader = new BufferedReader(new InputStreamReader((new FileInputStream(file))));

            /** Read every line in the file */
            while (fileReader.ready()) {
                String line = fileReader.readLine();
                int productIid = Integer.parseInt(line.substring(0, line.indexOf(" ")));
                if (id == productIid) {
                    System.out.println(line);
                }
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }
}
