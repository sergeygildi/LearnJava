package com.education.LearnJava.LearnPatterns.Creational.FactoryMethod;

class CarSelector {

    public Car getCar (Type type){
        Car car = null;

        switch (type) {
            case LUXURY:
                car = new Porsche();
                break;
            case UNIVERSAL:
                car = new Jeep();
                break;
            case HATCHBACK:
                car = new NewJeep();
                break;
        }

        return car;
    }
}
