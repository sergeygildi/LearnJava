package com.education.LearnJava.LearnThreads.Patterns;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Serhii Hildi on 15.11.18.
 */
public class PatternProducerConsumerWithMethodWaitAndNotify {

    public static void main(String[] args) {

        ProducerConsumer pc = new ProducerConsumer();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
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

class ProducerConsumer {

    private final int LIMIT = 10;
    private Queue<Integer> queue = new LinkedList<>();
    private final Object lock = new Object();

    public void producer() throws InterruptedException {

        int value = 0;

        while (true){
            synchronized (lock){
                while (queue.size() == LIMIT){
                        lock.wait();
                }
                queue.offer(value++);
                lock.notify();
            }
        }
    }

    public void consume() throws InterruptedException {

        while (true){
            synchronized (lock){

                while (queue.size() == 0){
                        lock.wait();
                 }

                Integer value = queue.poll();
                System.out.println(value);
                System.out.println("Queue size is " + queue.size());
                lock.notify();
            }

            Thread.sleep(1000);
        }
    }
}