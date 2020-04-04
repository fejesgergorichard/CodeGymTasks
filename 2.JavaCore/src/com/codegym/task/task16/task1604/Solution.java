package com.codegym.task.task16.task1604;

/* 
Displaying a stack trace

*/

// import jdk.jfr.StackTrace;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new SpecialThread());
        thread.start();

        System.out.println("*****************");

        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
    }

    public static class SpecialThread implements Runnable {
        @Override
        public void run() {
            /*System.out.println("Current thread: ");
            System.out.println(Thread.currentThread());
            System.out.println(Thread.activeCount());

            System.out.println("Elements of the stack trace: ");*/
            for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
                System.out.println(element);
            }
        }
    }

}
