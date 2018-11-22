package com.cs50.edu.Exercises;

import java.util.Scanner;

/**
 * Created by Serhii Hildi on 21.11.18.
 *
 *
 * Посчитать сколько человек сходивший в душ тратит воды.
 * 1 минута = 6 бутылок воды
 * Сколько бутылок воды нужно, чтобы помытся n - минут
 * n - пользовательский ввод
 * В программе должно быть реализована проверка на валидность введенного числа.
 */
public class WaterCalc {

    private final static int WATER_BOTTLE_BY_MINUTE = 6;

    public static void main(String[] args) {
        System.out.println("How much time u have a shower-time?");
        new WaterCalc().check();
    }

    private void check() {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            int check;

            if (scanner.hasNextInt()) {

                check = scanner.nextInt();
                if (check <= 0) {
                    System.out.println("Try again ...");
                    continue;
                }

            } else {
                System.out.println("Type a correct number");
                scanner.next();
                continue;
            }

            System.out.println("Пока мылся, ты использовал " + (check * WATER_BOTTLE_BY_MINUTE) + " бутылок воды");
            break;
        }
    }
}
