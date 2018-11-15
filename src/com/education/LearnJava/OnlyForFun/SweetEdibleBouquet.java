package com.education.LearnJava.OnlyForFun;

class SweetEdibleBouquet extends EdibleBouquet {

    public SweetEdibleBouquet() {
        super();
    }

    public SweetEdibleBouquet(String name, float price) {
        super(name, price);
    }

    public SweetEdibleBouquet(float price, String name) {
        super(price, name);
    }

    public SweetEdibleBouquet(String name, int price) {
        super(name, price);
    }

    public SweetEdibleBouquet(int price, String name) {
        super(price, name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public float getPrice() {
        return super.getPrice();
    }
}