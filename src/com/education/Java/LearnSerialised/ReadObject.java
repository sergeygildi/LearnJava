package com.education.Java.LearnSerialised;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person p1 = (Person) ois.readObject();
            Person p2 = (Person) ois.readObject();

            System.out.println(p1);
            System.out.println(p2);

            ois.close();
        } catch (IOException e) {
            System.out.println("Something wrong");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
