package com.cs50.edu.Exercises;

import java.util.Scanner;

/**
 * Created by Serhii Hildi on 21.11.18.
 *
 * Написать программу, которая будет преобразовывать любое введенное пользователем число в куб
 */
public class CubeFunction {

    public static void main(String[] args) {
        new CubeFunction().go();
    }

    private void go() {
        int cube;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число , которое нужно произвести в куб ...");

        while (scanner.hasNext()) {

            int check;

            if (scanner.hasNextInt()) {

                check = scanner.nextInt();
                cube = cube(check);

                if (check <= 0) {
                    System.out.println("Введите корректное число ...");
                    continue;
                }
            } else {
                System.out.println("Попробуйте снова ...");
                scanner.next();
                continue;
            }

            System.out.println("Вы ввели число: " + check + ".\n Его кубическое представление равно = " + cube);

            if ("break".equalsIgnoreCase(scanner.next())) {
                break;
            }
        }
    }

    private int cube(int i) {
        return i * i * i;
    }


}
