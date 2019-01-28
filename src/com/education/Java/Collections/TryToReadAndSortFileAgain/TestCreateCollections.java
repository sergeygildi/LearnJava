package com.education.Java.Collections.TryToReadAndSortFileAgain;

import java.util.ArrayList;
import java.util.List;

public class TestCreateCollections {

    /**
     * Create 5 objects class Mouse ant added them at new list. (ArrayList)
     */


    public void go(){
        List<Animal> animals = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String n = "Same Animal name " + i;
            int v = (int) (Math.random() * 100);

            animals.add(new Mouse(n, v));
        }
//        takeAnimal(animals);
        System.out.println();

        List<Mouse> mouse = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String n = "Same mouse name " + i;
            int v = (int) (Math.random() * 100);

            mouse.add(new Mouse(n, v));
        }
        takeAnimal(mouse);
    }

    public static void main(String[] args) {

        TestCreateCollections t = new TestCreateCollections();
        t.go();

    }

    public void takeAnimal(List<? extends Animal> a){
        for (Animal animal : a) {
            System.out.println(animal);
        }
    }
}
