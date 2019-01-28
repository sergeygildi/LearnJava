package com.education.Java.Loops;

public class TrueWhile {
    public static void main(String[] args) {


        for (int j = 0; j<=10000; j++) {
            if (j%2 == 0) {
                System.out.println("4etnoe: = " + j);
                continue;
            }
            System.out.println("Ne chetnoe 4islo: " + j);
        }
        System.out.println("End!");

    }
}
