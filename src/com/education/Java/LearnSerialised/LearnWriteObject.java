package com.education.Java.LearnSerialised;

import java.io.*;

public class LearnWriteObject implements Serializable {
    public static void main(String[] args) {

        Person p1 = new Person(1, "Igor");
        Person p2 = new Person(23, "Igor500");

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(p1);
            oos.writeObject(p2);

            oos.close();
        } catch (IOException e) {
            System.out.println("WOW");
        }

    }
}
