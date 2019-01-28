package com.education.Java.Collections.TryToReadSongTitleUdnerFileTxt.LearnTreeSetCollections;

import java.util.Objects;

public class Mouse{

    private String name;

    public Mouse() {
    }

    public Mouse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mouse mouse = (Mouse) o;
        return Objects.equals(name, mouse.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

//    @Override
//    public int compareTo(Object o) {
//        Mouse mouse = (Mouse) o;
//        return (name.compareTo(mouse.name));
//    }
}
