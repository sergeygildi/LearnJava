package com.education.LearnJava.LearnCollections.TryToReadAndSortFileAgain;

public class Mouse extends Animal{

    String name;
    int age;

    public Mouse() {
    }

    public Mouse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }
}
