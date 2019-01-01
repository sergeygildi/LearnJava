package com.headfirst.desingpatterns.firstExample;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck model = new MallardDuck();
        model.swim();
        model.display();

        model.setFlyBehavior(new FlyWithWings());
        model.performFly();
        model.setQuackBehavior(new MuteQuack());
        model.performQuack();
    }
}
