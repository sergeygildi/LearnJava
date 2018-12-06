package com.education.LearnJava.LearnPatterns.Creational.AbstractFactory.transport.impl.car;

import com.education.LearnJava.LearnPatterns.Creational.AbstractFactory.transport.interfaces.Car;

public class Porsche implements Car {

    @Override
    public void drive() {
        System.out.println("Porsche run ...");
    }

    @Override
    public void stopped() {
        System.out.println("Porsche stopped ...");
    }
}
