package com.education.Java.LearnPatterns.Creational.Singleton;

public class Test {
    public static void main(String[] args) {
        TestSingleton.getInstance().print();
        TestSingleton.getInstance().print();
        TestSingleton.getInstance().print();
    }
}
