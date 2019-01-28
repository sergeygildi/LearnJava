package com.education.Java.LearnThreads;

import java.util.Scanner;

/**
 * Created by Serhii Hildi on 15.11.18.
 */
public class SixthLessLearnWaitAndNotifyMethods {
    public static void main(String[] args) {

        WaitAndNotify waitAndNotify = new WaitAndNotify();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitAndNotify.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitAndNotify.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class WaitAndNotify {

    private Object lock = new Object();

    public void produce() throws InterruptedException {
        synchronized (lock){
            System.out.println("Producer thread started ...");
            lock.wait();
            System.out.println("Producer thread resumed ...");
        }
    }
    public void consume() throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        Thread.sleep(2000);

        synchronized (lock){
            System.out.println("Waiting for return key pressed");
            sc.nextLine();
            lock.notify();
        }
    }
}



