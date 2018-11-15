package com.education.LearnJava.OnlyForFun;

import java.util.Scanner;

public class InstaShopEdibleBouquet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("To create new bouquet choice one of two numbers. (1 or 2 and Enter) \n If u won't to exit - type zero");

        while (true) {
            switch (sc.nextInt()) {
                case 1 :
                    double random = (Math.random() * 1000);
                    MeetEdibleBouquet neb = new MeetEdibleBouquet("Meet bouquet", (int) random);
                    System.out.println("We create new meet bouquet. \n" + neb.getName() + " " +  "\n All types of bouquets: "  + neb.getPrice());
                    break;
                case 2 :
                    random = (Math.random() * 1000);
                    SweetEdibleBouquet web = new SweetEdibleBouquet("Sweet bouquet", (int) random);
                    System.out.println("We create new meet bouquet. \n" + web.getName() + " " +  "\n All types of bouquets: "  + web.getPrice());
                    break;
                case 3 :
                    System.out.println("U stopped process!");
                    break;
                    default:
                        System.out.println("Try again. Choice one of two numbers. 1 or 2");
            }
        }
    }
}
