package com.education.LearnJava.LearnPatterns.Creational.AbstractFactory.transport.impl.car;

import com.education.LearnJava.LearnPatterns.Creational.AbstractFactory.transport.interfaces.Car;

public class Niva implements Car {

    @Override
    public void drive() {
        System.out.println("Niva drive...");
    }

    @Override
    public void stopped() {
        System.out.println("Niva stopped");
    }
}
