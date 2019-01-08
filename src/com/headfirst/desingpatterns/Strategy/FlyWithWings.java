package com.headfirst.desingpatterns.Strategy;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm fly with wings ...");
    }
}
