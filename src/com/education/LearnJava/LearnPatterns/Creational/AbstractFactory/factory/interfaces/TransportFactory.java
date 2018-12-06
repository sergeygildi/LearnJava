package com.education.LearnJava.LearnPatterns.Creational.AbstractFactory.factory.interfaces;

import com.education.LearnJava.LearnPatterns.Creational.AbstractFactory.transport.interfaces.Airoraft;
import com.education.LearnJava.LearnPatterns.Creational.AbstractFactory.transport.interfaces.Car;

public interface TransportFactory {

    Car createCar();
    Airoraft createAirCraft();
}
