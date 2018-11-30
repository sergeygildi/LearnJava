package com.education.LearnJava.LearnPatterns.Creational.AbstractFactory.transport.impl.aircraft;

import com.education.LearnJava.LearnPatterns.Creational.AbstractFactory.transport.interfaces.Airoraft;

public class Boeing747 implements Airoraft {
    @Override
    public void flight() {
        System.out.println("Boeing747 fly ...");
    }
}
