package com.education.Java.ReadFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {

    public static void main(String[] args) throws FileNotFoundException {


        String separator = File.separator;
//        C:\Users\serhiihildi\Desktop\
        String path = separator + "Users" + separator + "serhiihildi" + separator + "Desktop" + separator +  "test.txt";


        File file = new File(path);

        Scanner sc = new Scanner(file);
//        String input = sc.nextLine();
//
//        while (sc.hasNextLine()){
//            System.out.println(sc.nextLine());
//        }

//        ------------------------
//        https://youtu.be/j3I-jLGW8yU?list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak
        sc.close();
    }
}
