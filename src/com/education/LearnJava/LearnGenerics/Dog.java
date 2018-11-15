package com.education.LearnJava.LearnGenerics;

public class Dog extends Animal{

    Dog() {
    }

    Dog(int id) {
        super(id);
    }

    @Override
    public void eat() {
        System.out.println("Im dog and im eat.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
