package com.education.LearnJava.LearnThreads;

import java.util.Scanner;

/**
 * Created by Serhii Hildi on 15.11.18.
 */
public class SecondLess {

    public static void main(String[] args) {

        // Create new tread
        MySecondThread mySecondThread = new MySecondThread();
        mySecondThread.start();

        // Create scanner. Wait "Enter";
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        // Call shutDown() method. Assign variable "running" value "false".
        mySecondThread.shutDown();
    }
}

class MySecondThread extends Thread {

    private volatile boolean running = true;

    @Override
    public void run() {

        while (running){
            System.out.println("Hello");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("oops");
                e.printStackTrace();
            }
        }
    }

    public void shutDown() {
        this.running = false;
    }
}

