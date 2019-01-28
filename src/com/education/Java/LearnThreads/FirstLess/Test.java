package com.education.Java.LearnThreads.FirstLess;

public class Test {

    public static void main(String[] args) {
        new MyThread().run();
        new MyThread().run();
        System.out.println(" 1231");
    }
}


class MyThread extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            System.out.println("My Thread: " + i);
        }

    }
}