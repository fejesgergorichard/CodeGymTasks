package com.codegym.task.task16.task1622;

import java.lang.reflect.Array;
import java.util.*;

/*
Consecutive threads

*/
public class Solution {
    public volatile static int COUNT = 4;

    public static void main(String[] args) throws InterruptedException {
        List<SleepingThread> sleepingThreads = new ArrayList<>(COUNT);
        for (int i = 0; i < COUNT; i++) {
            sleepingThreads.add(new SleepingThread());
            sleepingThreads.get(i).join();

        }
    }

    public static class SleepingThread extends Thread {
        private static volatile int threadCount = 0;
        private volatile int countdownIndex = COUNT;

        public SleepingThread() throws InterruptedException {
            super(String.valueOf(++threadCount));
            start();
        }

        public void run() {
            while (true) {
                System.out.println(this);
                if (--countdownIndex == 0) return;
                //write your code here
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    //e.printStackTrace();
                    System.out.println("Thread interrupted");
                }
            }
        }

        public String toString() {
            return "#" + getName() + ": " + countdownIndex;
        }
    }
}