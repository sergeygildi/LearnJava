package com.headfirst.desingpatterns.Decorator;

/**
 * Created by Serhii Hildi on 08.01.19.
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
