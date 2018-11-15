package com.education.LearnJava.OOP.Structure;

import java.util.Scanner;

/**
 * Created by Serhii Hildi on 20.10.18.
 */

public class Calculate extends CalculateAbs {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = 5;

    void calc() {
        double res1 = plus(a, b);
        System.out.println((int) res1);

        double res2 = minus(a, b);
        System.out.println((int) res2);

        double res3 = division(a, b);
        System.out.println((int) res3);

        double res4 = multiplication(a, b);
        System.out.println((int) res4);
    }
}
