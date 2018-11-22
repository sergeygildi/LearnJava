package com.education.LearnJava;

import java.util.ArrayList;
import java.util.List;

public class LearnGenerics {
    public static void main(String[] args) {

        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");

        String animal = (String) animals.get(1);

        System.out.println(animal);

//    ------------------------------- Generics
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");

        String animal2 = animals2.get(2);

        System.out.println(animal2);

//     -------------------------------- Java 7
        List<String> animals3 = new ArrayList<>();
        animals3.add("cat");
        animals3.add("dog");
        animals3.add("frog");

        LearnGenerics l = new LearnGenerics();
        l.getAll();
    }

    public void getAll(){
        List<String> animals3 = new ArrayList<>();
        animals3.add("cat");
        animals3.add("dog");
        animals3.add("frog");
        System.out.println();

        for (int i = 0; i < animals3.size(); i++) {
            System.out.println(animals3.get(i));
        }

//        System.out.println(animals3.get(0));
//        System.out.println(animals3.get(1));
//        System.out.println(animals3.get(2));

    }
}

