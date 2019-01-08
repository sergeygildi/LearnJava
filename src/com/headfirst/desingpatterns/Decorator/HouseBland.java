package com.headfirst.desingpatterns.Decorator;

/**
 * Created by Serhii Hildi on 08.01.19.
 */
public class HouseBland extends Beverage {

    HouseBland() {
        description = "House Bland Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
