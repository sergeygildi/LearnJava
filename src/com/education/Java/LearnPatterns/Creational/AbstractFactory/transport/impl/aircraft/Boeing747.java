package com.education.Java.LearnPatterns.Creational.AbstractFactory.transport.impl.aircraft;

import com.education.Java.LearnPatterns.Creational.AbstractFactory.transport.interfaces.Airoraft;

public class Boeing747 implements Airoraft {
    @Override
    public void flight() {
        System.out.println("Boeing747 fly ...");
    }
}
