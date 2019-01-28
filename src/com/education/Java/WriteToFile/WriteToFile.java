package com.education.Java.WriteToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("TestFile");
        PrintWriter pw = new PrintWriter(file);

        pw.println("Soy row 1");
        pw.println("Soy row 2");
        pw.println("Soy row 3");

        pw.close();
    }
}
