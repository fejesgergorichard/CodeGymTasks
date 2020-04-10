package com.codegym.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }


    public static void main(String[] args) {
        threads.get(4).start();

    }

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true);
        }
    }

    public static class Thread2 extends Thread {
        @Override
        public void run() {
            while (!isInterrupted());
            System.out.println("InterruptedException");
        }
    }

    public static class Thread3 extends Thread {
        @Override
        public void run() {
            try {
                while(!isInterrupted()) {
                    System.out.println("Hurray");
                    Thread.currentThread().sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class Thread4 extends Thread implements Message {
        @Override
        public void showWarning() {
            if (isAlive()) {
                interrupt();
            }

        }

        @Override
        public void run() {
            while (!isInterrupted());
        }
    }

    public static class Thread5 extends Thread {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        String enteredValue;
        int enteredValueInt;

        @Override
        public void run() {
            try {
                do {
                    enteredValue = reader.readLine();
                    if (!enteredValue.equals("N")) {
                        enteredValueInt = Integer.parseInt(enteredValue);
                        sum += enteredValueInt;
                    }
                    else break;
                } while (!enteredValue.equals("N"));
                System.out.println(sum);

            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("IOException occured!");
            }

        }
    }
}