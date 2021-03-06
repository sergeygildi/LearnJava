package com.cs50.edu.Exercises.Tasks;

/**
 * Created by Serhii Hildi on 22.11.18.
 */

import java.math.BigInteger;

/**
 *     1. Написать программу, которая находит наибольший общий делитель двух целых положительных чисел.
 *     2. Написать программу, которая находит сумму цифр заданного целого числа.
 *     3. Написать программу проверки того, что заданное число простое (т.е. не делится без остатка ни на какие числа, кроме себя и 1).
 *     4. Подсчитать сумму ряда 1!  - 2! +  3! - 4! + 5! - ... + N! для заданного числа N &gt; 0.
 *     5. Подсчитать, сколько N-значных чисел (N-четное, больше 1) имеют равную сумму первой половины и второй половины цифр (счастливые числа). Пример: вход N=6, выход - количество шестизначных чисел ABCDEF (ведущий ноль не допускается), у которых (A+B+C) = (D+E+F)
 *     6. Разместить в памяти массив из N элементов и заполнить его рядом Фиббоначчи: 1, 1, 2, 3, 5, 8, 13, 21, ... . В этом ряду каждое следующее число является суммой двух предыдущих.
 *     7. Создать целый массив из N элементов и заполнить его простыми числами: 2, 3, 5, 7, 11, 13, 17.
 *     8. Создать двумерный массив (N*M) символов и заполнить его буквами 'Ч' и 'Б' в шахматном порядке.
 *     9. Создать целый шестимерный массив с двумя значениями в каждом измерении. Заполнить массив числами из начала натурального ряда: 1, 2, 3, ... . При заполнении использовать один цикл.
 *     10. Создать "треугольный" массив из N строк и заполнить его биномиальными коэффициентами.
 *
 *     Замечания:
 *     1. Проект в Eclipse должен иметь название Task1.
 *     2. Решение каждой из 10 задач оформить в виде отдельного класса. Значение входных данных получать из командной строки. В случае, если входные данные заданы не были - выводить информационное сообщение об этом.
 *     3. Дополнительно создать класс Demo, который демонстрирует работу всех 10 подпрограмм с некоторыми заданными значениями.
 *     4. Дополнительно для каждой задачи написать batch файл (Windows) или shell скрипт (Linux), который компилирует и запускает на выполнение соответствующую задачу с некоторыми значениями параметров.  Скрипт класть в каталог Task1\src\. Вручную запустить скрипты, проверить, чтобы все работало.
 *     5. Соблюдать code convention.
 */
public class Task1 {
    // 1.
    public static void main(String[] args) {
        System.out.println(new Task1().gsd(2, 5));
        new Task1().gsd1(6,2);
    }

    // С помощью рекурсии
    private int gsd(int a, int b) {
        return b == 0 ? a : gsd(b, a % b);
    }

    // С помощью алгоритма Евклида
    private void gsd1(int a, int b) {
        while (a != 0 && b != 0){
            if (a > b){
                a = a % b;
            } else {
                b = b % a;
            }
        }
        System.out.println(a + b);
    }
}

/**
 * 2. Написать программу, которая находит сумму цифр заданного целого числа.
 */
class Task2 {

    private static int digits = 123;
    private static int sum;

    public static void main(String[] args) {
        new Task2().go(digits);
    }

    private void go(int var) {
        while (var != 0) {
            sum += (var % 10);
            var /= 10;
        }
        System.out.println(sum + " ");
    }
}

/**
 * 3. Написать программу проверки того, что заданное число простое (т.е. не делится без остатка ни на какие числа, кроме себя и 1).
 */
class Task3 {
    public static void main(String[] args) {
        check1(2);
        check2(2);
    }

    // тест Рабина-Миллера
    // Даст true or false
    private static void check1(Integer integer){
        BigInteger bigInteger = BigInteger.valueOf(integer);
        boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(integer));
        System.out.println(probablePrime);
    }

    // С помощью многочисленных проверок
    private static void check2(int a) {

        int var = 2;

        while (a > 1) {
            if (a % var != 0) {
                var++;
                check2(a);
            } else if (a % var == 0) {
                printThat(var, a);
                break;
            }
        }
    }

    private static void printThat(int var, int a) {
        if (var == a) {
            System.out.println(a + " is a natural number.");
        } else {
            System.out.println(a + " is not a natural number.");
        }
    }
}

/**
 *  4. Подсчитать сумму ряда 1! - 2! +  3! - 4! + 5! - ... + N! для заданного числа N = 10.
 */
class Task4 {
    private static final int N = 6;

    public static void main(String[] args) {
        System.out.println(sumFact(N));
    }

    static long factorial(int number) {
        int result = 1;
        for (int i = 2; i <= number; ++i) {
            result *= i;
        }
        return result;
    }

    static long sumFact(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            if (i % 2 != 0) {
                result += factorial(i);
            } else {
                result -= factorial(i);
            }
        }
        return result;
    }
}

/**
 *  5. Подсчитать, сколько N-значных чисел (N-четное, больше 1) имеют равную сумму первой половины и второй половины цифр (счастливые числа). Пример: вход N=6, выход - количество шестизначных чисел ABCDEF (ведущий ноль не допускается), у которых (A+B+C) = (D+E+F)
 */

/**
 *  6. Разместить в памяти массив из N элементов и заполнить его рядом Фиббоначчи: 1, 1, 2, 3, 5, 8, 13, 21, ... . В этом ряду каждое следующее число является суммой двух предыдущих.
 */

/**
 *  7. Создать целый массив из N элементов и заполнить его простыми числами: 2, 3, 5, 7, 11, 13, 17.
 */

/**
 *  8. Создать двумерный массив (N*M) символов и заполнить его буквами 'Ч' и 'Б' в шахматном порядке.
 */

/**
 *  9. Создать целый шестимерный массив с двумя значениями в каждом измерении. Заполнить массив числами из начала натурального ряда: 1, 2, 3, ... . При заполнении использовать один цикл.
 */

/**
 *  10. Создать "треугольный" массив из N строк и заполнить его биномиальными коэффициентами.
 */