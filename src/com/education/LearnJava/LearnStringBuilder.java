package com.education.LearnJava;

public class LearnStringBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());

        sb.append(" my").append(" friend");
        System.out.println(sb.toString());

        System.out.printf("This is a string, %s \n", "NICE");
        System.out.printf("This is a int, %d \n", 10);
        System.out.printf("This is a int, %18d \n", 11);
        System.out.printf("This is a int, %10d \n", 12);
        System.out.printf("This is a int, %-10d \n", 12);
        System.out.printf("This is a int, %.2f \n", 12.2123312);

        /**
         * Hello
         * Hello my friend
         * This is a string, NICE
         * This is a int, 10
         * This is a int,                 11
         * This is a int,         12
         * This is a int, 12
         * This is a int, 12,21
         */
    }
}