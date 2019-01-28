package com.education.Java.LearnPatterns.Creational.AbstractFactory.start;

import com.education.Java.LearnPatterns.Creational.AbstractFactory.factory.impl.RussianFactory;
import com.education.Java.LearnPatterns.Creational.AbstractFactory.factory.impl.USAFactory;
import com.education.Java.LearnPatterns.Creational.AbstractFactory.factory.interfaces.TransportFactory;

public class Start {
    public static void main(String[] args) {
        TransportFactory russianFactory = new RussianFactory();
        russianFactory.createCar().drive();

        new USAFactory().createAirCraft().flight();
    }
}
