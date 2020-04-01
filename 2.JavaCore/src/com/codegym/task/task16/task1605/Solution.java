package com.codegym.task.task16.task1605;

import java.sql.Time;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* 
Let's talk music

*/

public class Solution {
    public static int delay = 1000;

    public static void main(String[] args) {
        Thread violin = new Thread(new Violin("Player"));
        violin.start();
    }

    public static void sleepNSeconds(int n) {
        try {
            Thread.sleep(n * delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public interface MusicalInstrument extends Runnable {
        Date startPlaying();

        Date stopPlaying();
    }

    public static class Violin implements MusicalInstrument {
        private String owner;

        public Violin(String owner) {
            this.owner = owner;
        }

        public Date startPlaying() {
            System.out.println(this.owner + " is starting to play");
            return new Date();
        }

        public Date stopPlaying() {
            System.out.println(this.owner + " is stopping playing");
            return new Date();
        }

        @Override
        public void run() {
            Date startedPlaying = startPlaying();
            sleepNSeconds(1);
            Date stoppedPlaying = stopPlaying();
            System.out.println("Played for " + getDifferenceInMs(startedPlaying, stoppedPlaying) + " ms");
        }

        public long getDifferenceInMs(Date start, Date end) {
            return TimeUnit.MILLISECONDS.convert((end.getTime() - start.getTime()), TimeUnit.MILLISECONDS);
        }
    }
}
