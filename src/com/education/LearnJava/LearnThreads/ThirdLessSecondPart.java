package com.education.LearnJava.LearnThreads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Serhii Hildi on 15.11.18.
 */
public class ThirdLessSecondPart {
    public static void main(String[] args) {
        new Worker().main();
    }

    private static class Worker {

        Random random = new Random();

        Object lock1 = new Object();
        Object lock2 = new Object();

        private List<Integer> list1 = new ArrayList<>();
        private List<Integer> list2 = new ArrayList<>();

        public void addToList1(){
            synchronized (lock1){
                doSleep();
                list1.add(random.nextInt(100));
            }
        }

        public synchronized void addToList2(){
            synchronized (lock2){
                doSleep();
                list2.add(random.nextInt(100));
            }
        }

        private void doSleep() {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        public void work(){
            for (int i = 0; i < 1000; i++) {
                addToList1();
                addToList2();
            }
        }

        public void main() {

            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    work();
                }
            });

            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    work();
                }
            });


            thread1.start();
            thread2.start();

            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            long before = System.currentTimeMillis();
            work();
            long after = System.currentTimeMillis();

            System.out.println("Program " + (after - before) + " ms to run");

            System.out.println("list1 " + list1.size());
            System.out.println("list2 " + list2.size());
        }
    }
}
