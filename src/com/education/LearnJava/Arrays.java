package com.education.LearnJava;

import java.util.Collections;
import java.util.Random;

public class Arrays {

    public static void main(String[] args) {

        int[][] num2 = new int [][] {{1,2,3,4,5}, {6,7,8,6,7}, {15,9,10,11,12}};
        num2[0][4] = 1000;
        num2[1][4] = 11000;
        num2[2][4] = 111000;

        for (int i = 0; i < num2.length; i++) { //проходка по строкам
            for (int j = 0; j <= 4 ; j++) { //проходка по столбцам
                System.out.print(num2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        Сортировка();
        ОбратнаяСортировка();
        Треугольник();
        Квадрат();
    }

    private static void ОбратнаяСортировка() {
        Integer[] sorted = new Integer[10];
        Random random = new Random();

        for (int i = 0; i < sorted.length; i++) {
            sorted[i] = random.nextInt(100);
        }

        java.util.Arrays.sort(sorted, Collections.reverseOrder());

        System.out.println("Обратная сортировка");
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    private static void Сортировка() {
        int[] sorted = new int[] {123,1245,122,466,7654,3};
        java.util.Arrays.sort(sorted);

        System.out.println("Сортировка по порядку");
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    private static void Треугольник() {

        char[][] треугольник = new char[5][];
        треугольник[0] = new char[1];
        треугольник[1] = new char[2];
        треугольник[2] = new char[3];
        треугольник[3] = new char[4];
        треугольник[4] = new char[5];


        for (int i = 0; i < треугольник.length; i++) {
            for (int j = 0; j < треугольник[i].length; j++) {
                треугольник[i][j] = 'q';
            }
        }

        for (int i = 0; i < треугольник.length; i++) {
            for (int j = 0; j < треугольник[i].length; j++) {
                System.out.print(треугольник[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void Квадрат() {

        char[][] квадрат = new char[5][5];

        for (int i = 0; i < квадрат.length; i++) {
            for (int j = 0; j < квадрат[i].length; j++) {
                квадрат[i][j] = 'A';
            }
        }

        for (int i = 0; i < квадрат.length; i++) {
            for (int j = 0; j < квадрат[i].length; j++) {
                System.out.print(квадрат[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}