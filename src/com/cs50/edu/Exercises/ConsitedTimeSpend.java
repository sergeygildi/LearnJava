package com.cs50.edu.Exercises;

import java.util.Scanner;

/**
 * Created by Serhii Hildi on 22.11.18.
 *
 * Дано: 1 песня в среднем 3 минут
 * Посчитать: сколько песен человек случаешь за введенное количество времени
 *
 */
public class ConsitedTimeSpend {

    final static float SONG_TIME = 3.00f;

    public static void main(String[] args) {
        System.out.println("Type anyone symbol ...");
        new ConsitedTimeSpend().go();
    }

    private void go() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()){

            float check;


            if (scanner.hasNextInt()){
                check = scanner.nextInt();
                if (!checked(check)){
                    float result = check / SONG_TIME;
                    System.out.printf("U listen a %.2f music composition.\n", result);
                }

            } else {
                System.out.println("Tre again ...");
                scanner.next();
            }
        }
        System.out.println("All worked good!");
    }

    private boolean checked(float check) {
        if (check <= 0){
            System.out.println("Type another symbol");
            return true;
        }
        return false;
    }
}
