package com.headfirst.desingpatterns.Strategy;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<nothing>>");
    }
}
