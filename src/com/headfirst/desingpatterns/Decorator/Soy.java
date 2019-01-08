package com.headfirst.desingpatterns.Decorator;

/**
 * Created by Serhii Hildi on 08.01.19.
 */
public class Soy extends CondimentDecorator {

    private Beverage beverage;

    Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    private Soy() {
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
