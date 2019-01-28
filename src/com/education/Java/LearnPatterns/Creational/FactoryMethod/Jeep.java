package com.education.Java.LearnPatterns.Creational.FactoryMethod;

public class Jeep implements Car {
    @Override
    public void drive() {
        System.out.println("100");
    }

    @Override
    public void stop() {
        System.out.println("10");
    }
}
