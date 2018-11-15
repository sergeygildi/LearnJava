package com.education.LearnJava.LearnThreads;

/**
 * Created by Serhii Hildi on 15.11.18.
 */
public class ThirdLess {

    private int counter;

    public static void main(String[] args) {
        ThirdLess t = new ThirdLess();
        try {
            t.doWork();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void doWork() throws InterruptedException {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                go();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                go();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter);
    }

    private synchronized void increment() {
        counter++;
    }

    private void go() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
            increment();
        }
    }
}
