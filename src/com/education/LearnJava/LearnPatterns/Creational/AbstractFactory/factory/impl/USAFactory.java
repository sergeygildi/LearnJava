package com.education.LearnJava.LearnPatterns.Creational.AbstractFactory.factory.impl;

import com.education.LearnJava.LearnPatterns.Creational.AbstractFactory.factory.interfaces.TransportFactory;
import com.education.LearnJava.LearnPatterns.Creational.AbstractFactory.transport.impl.aircraft.Boeing747;
import com.education.LearnJava.LearnPatterns.Creational.AbstractFactory.transport.impl.car.Porsche;
import com.education.LearnJava.LearnPatterns.Creational.AbstractFactory.transport.interfaces.Airoraft;
import com.education.LearnJava.LearnPatterns.Creational.AbstractFactory.transport.interfaces.Car;

public class USAFactory implements TransportFactory {

    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Airoraft createAirCraft() {
        return new Boeing747();
    }
}
