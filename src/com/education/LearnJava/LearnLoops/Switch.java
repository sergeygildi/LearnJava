package com.education.LearnJava.LearnLoops;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type age");
        int age = sc.nextInt();

        switch (age){
            case 0 :
                System.out.println("Ты новорожденный");
                break;
            case 7 :
                System.out.println("Ты школьник");
                break;
            case 18 :
                System.out.println("Ты студент");
                break;
            case 100 :
                System.out.println("Ты уебан");
                break;
            default:
                System.out.println("Другой возраст");
        }

    }
}
