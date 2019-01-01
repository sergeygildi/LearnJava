package com.headfirst.desingpatterns.firstExample;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<nothing>>");
    }
}
