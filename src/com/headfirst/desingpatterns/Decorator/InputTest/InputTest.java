package com.headfirst.desingpatterns.Decorator.InputTest;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Serhii Hildi on 08.01.19.
 */
public class InputTest {

    public static void main(String[] args) {

        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("text.txt")));

            while ((c = in.read()) >= 0) {
                System.out.print(((char) c));
            }
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
