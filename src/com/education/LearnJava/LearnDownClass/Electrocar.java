package com.education.LearnJava.LearnDownClass;

public class Electrocar {

    private int id;

    public static void main(String[] args) {
        Electrocar e = new Electrocar(1);
        e.start();
        Electrocar.Battery battery = new Electrocar.Battery();

    }

    /**
     * Вложенный нестатический класс
     */
    private class Motor{
        public void startMotor(){
            System.out.println("id = " + id + " и иди нахуй");
        }
    }
    /**
     * Статический вложенный класс
     */
    public static class Battery{
        public void charge() {
            System.out.println("Charging");
        }
    }

    public Electrocar(){};

    public Electrocar (int id){
        this.id = id;
    }

    public void start(){
        Motor motor = new Motor();
        motor.startMotor();

        int x = 0;

        class SomeClass{
            public void SomeMethod(){
                System.out.println(x);
                System.out.println(id);
            }
        }

        SomeClass someClass = new SomeClass();
        test(someClass);

        System.out.println("Electrocar " + id);
    }

    private void test(Object o) {
        System.out.println("Hiy");
    }
}
