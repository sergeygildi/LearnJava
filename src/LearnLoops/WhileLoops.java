package LearnLoops;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        /**
         * TODO Пример цика while
         * Работает по принципу:
         * Если (условие) выполняется, то выполнить (это);
         */
        System.out.println("Введи число");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        while (value != 1){
            System.out.println("Введи другое число");
            value = sc.nextInt();
        }
        System.out.println("Правильно, 1");
    }
}
