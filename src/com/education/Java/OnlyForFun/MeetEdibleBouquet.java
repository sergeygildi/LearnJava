package com.education.Java.OnlyForFun;

class MeetEdibleBouquet extends EdibleBouquet {

    public MeetEdibleBouquet() {
        super();
    }

    public MeetEdibleBouquet(String name, float price) {
        super(name, price);
    }

    public MeetEdibleBouquet(float price, String name) {
        super(price, name);
    }

    public MeetEdibleBouquet(String name, int price) {
        super(name, price);
    }

    public MeetEdibleBouquet(int price, String name) {
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
