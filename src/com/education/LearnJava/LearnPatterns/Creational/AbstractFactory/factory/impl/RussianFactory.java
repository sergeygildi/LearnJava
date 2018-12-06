package com.education.LearnJava.LearnPatterns.Creational.AbstractFactory.factory.impl;

import com.education.LearnJava.LearnPatterns.Creational.AbstractFactory.factory.interfaces.TransportFactory;
import com.education.LearnJava.LearnPatterns.Creational.AbstractFactory.transport.impl.aircraft.TU134;
import com.education.LearnJava.LearnPatterns.Creational.AbstractFactory.transport.impl.car.Niva;
import com.education.LearnJava.LearnPatterns.Creational.AbstractFactory.transport.interfaces.Airoraft;
import com.education.LearnJava.LearnPatterns.Creational.AbstractFactory.transport.interfaces.Car;

public class RussianFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Airoraft createAirCraft() {
        return new TU134();
    }
}
