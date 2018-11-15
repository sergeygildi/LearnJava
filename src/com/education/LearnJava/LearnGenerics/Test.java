package com.education.LearnJava.LearnGenerics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));


        List<Dog> listOfDog = new ArrayList<>();
        listOfDog.add(new Dog(3));
        listOfDog.add(new Dog(4));

        test(listOfAnimal);
//        test(listOfDog);
    }

    private static void test(List<? extends Animal> list) {
//        for(Animal animal : list) {
//            System.out.println(animal);
//        }

        Animal animal1 = new Animal();
        animal1.eat();

        Dog dog = new Dog();
        dog.eat();

        Dog dog2 = new Dog(){
            public void eat(){
                System.out.println("get out, bitch!");
            }
        };
        dog2.eat();
    }
}
