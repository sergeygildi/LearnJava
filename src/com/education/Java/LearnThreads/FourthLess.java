package com.education.Java.LearnThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by Serhii Hildi on 15.11.18.
 */
public class FourthLess {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            executorService.submit(new Work(i));
        }
        executorService.shutdown();
        System.out.println("All tasks submitted");
        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}

class Work implements Runnable{

    private int id;

    public Work(int id){
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Work " + id + " was completed");


    }
}
