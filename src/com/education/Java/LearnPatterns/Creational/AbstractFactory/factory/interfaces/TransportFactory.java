package com.education.Java.LearnPatterns.Creational.AbstractFactory.factory.interfaces;

import com.education.Java.LearnPatterns.Creational.AbstractFactory.transport.interfaces.Airoraft;
import com.education.Java.LearnPatterns.Creational.AbstractFactory.transport.interfaces.Car;

public interface TransportFactory {

    Car createCar();
    Airoraft createAirCraft();
}
