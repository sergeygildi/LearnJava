package com.education.Java.LearnPatterns.Creational.FactoryMethod;

public class Porsche implements Car {
    @Override
    public void drive() {
        System.out.println("150");
    }

    @Override
    public void stop() {
        System.out.println("3");
    }
}
