package com.education.LearnJava.LearnPatterns.Creational.FactoryMethod;

public class Mersedec implements Car{

    @Override
    public void drive() {
        System.out.println("150");
    }

    @Override
    public void stop() {
        System.out.println("3");
    }
}
