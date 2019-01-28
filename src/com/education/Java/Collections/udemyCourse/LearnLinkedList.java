package com.education.Java.Collections.udemyCourse;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Serhii Hildi on 27.11.18.
 */
public class LearnLinkedList {

    private static final int NUMBER = 1_000_000;
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

//        linkedList.add(1);
//        linkedList.get(0);
//        linkedList.size();
//        linkedList.remove(0);

        some(arrayList);
        some(linkedList);
    }

    private static void some(List<Integer> list) {

        for (Integer i: list) {
            list.remove(i);
        }


        long start = System.currentTimeMillis();

        for (int i = 0; i < NUMBER; i++) {
            list.add(i, i);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
