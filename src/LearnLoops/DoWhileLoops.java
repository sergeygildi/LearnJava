package LearnLoops;

import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int value;

        /**
         * TODO Пример цикла Do While
         * Работает по принципу:
         * Сначала выполни (это), потом проверь условие
         */
        do {
            System.out.println("Write right number");
            value = sc.nextInt();
        } while (value != 5);
        System.out.println("That's right!");
    }
}
