package com.headfirst.desingpatterns.Decorator;

/**
 * Created by Serhii Hildi on 08.01.19.
 */
public class DarkRoast extends Beverage {

    DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
