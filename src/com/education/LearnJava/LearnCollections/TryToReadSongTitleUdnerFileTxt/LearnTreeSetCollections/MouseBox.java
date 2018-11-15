package com.education.LearnJava.LearnCollections.TryToReadSongTitleUdnerFileTxt.LearnTreeSetCollections;

import java.util.Comparator;
import java.util.TreeSet;

public class MouseBox {

    private TreeSet<Mouse> mouseList = new TreeSet<>(new MouseComparator());

    public static void main(String[] args) {
        new MouseBox().go();
    }

    class MouseComparator implements Comparator<Mouse>{

        @Override
        public int compare(Mouse o1, Mouse o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    private void go() {

        for (int i = 1; i <= 5; i++) {
            mouseList.add(new Mouse("Мышь " + i));
        }
        System.out.println(mouseList);
    }


}
