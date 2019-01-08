package com.headfirst.desingpatterns.Decorator;

/**
 * Created by Serhii Hildi on 08.01.19.
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public Mocha() {
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
