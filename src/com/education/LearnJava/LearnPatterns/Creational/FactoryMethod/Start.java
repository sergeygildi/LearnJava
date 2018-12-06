package com.education.LearnJava.LearnPatterns.Creational.FactoryMethod;

public class Start {
    public static void main(String[] args) {

        CarSelector carSelector = new CarSelector();

        Car car = carSelector.getCar(Type.LUXURY);
        car.drive();
        car.stop();
    }
}
