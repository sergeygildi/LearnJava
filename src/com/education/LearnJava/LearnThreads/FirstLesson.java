package com.education.LearnJava.LearnThreads;

/**
 * Created by Serhii Hildi on 15.11.18.
 */
public class FirstLesson {
    public static void main(String[] args) {

        new Thread(new Runner()).start();

        new MyThread().start();
    }

    void go() {
        for (int i = 0; i < 100; i++) {

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("öops");
                e.printStackTrace();
            }

            System.out.println("Hello from MySecondThread " + i);
        }
    }
}


    class Runner implements Runnable {

        @Override
        public void run() {
           new FirstLesson().go();
        }
    }

    class MyThread extends Thread {

        @Override
        public void run() {
            new FirstLesson().go();
        }
    }
