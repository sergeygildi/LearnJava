package com.education.LearnJava.LearnCollections.udemyCourse;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Serhii Hildi on 27.11.18.
 */
public class LearnArrayList {


//    public static void main(String[] args) {
//        int[] x = new int[3];
//        for (int i = 0; i < 4; i++) {
//            x[i] = 1;
//        }
//    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        List<Integer> list2 = new LinkedList<>(list);

        for (Integer l: list2) {
            System.out.println(l);
        }
//        System.out.println(list);
//
//        System.out.println(list.get(0));
//        System.out.println(list.get(99));
//
//        System.out.println(list.size());
//
//        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//
//        for (Integer x : list) {
//            System.out.println(x);
//        }

        list.remove(5);
        System.out.println(list);
    }
}
