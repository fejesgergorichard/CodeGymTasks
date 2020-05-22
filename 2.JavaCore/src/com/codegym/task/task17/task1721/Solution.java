package com.codegym.task.task17.task1721;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.*;

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> linesForRemoval = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        String allLineFileName;
        String linesForRemovalFileName;

        BufferedReader rl = new BufferedReader(new InputStreamReader(System.in));
        //read two file names
        allLineFileName = rl.readLine();
        linesForRemovalFileName = rl.readLine();

        rl.close();

        //read files into ArrayList
        readInto(allLines, allLineFileName);
        readInto(linesForRemoval, linesForRemovalFileName);

        //run join data
        Solution data = new Solution();
        data.joinData();
    }

    public void joinData() throws CorruptedDataException {

        if (allLines.containsAll(linesForRemoval)) {
            allLines.removeAll(linesForRemoval);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }

    public static void readInto(List<String> target, String source){
        try {
            BufferedReader read = new BufferedReader(new FileReader(source));
            String line;
            while ((line = read.readLine()) != null){
                target.add(line);
            }
            read.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        catch (IOException e) {
            System.out.println("IO Error");
        }

    }
}



