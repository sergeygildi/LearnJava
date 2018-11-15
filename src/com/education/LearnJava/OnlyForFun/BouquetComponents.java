package com.education.LearnJava.OnlyForFun;

class BouquetComponents {
    
    String ingredientName;
    int price;

    public BouquetComponents() {
        System.out.println("Ошибка. Вы не передали никаких параметров");
    }

    public BouquetComponents(String ingredientName, int price) {
        this.ingredientName = ingredientName;
        this.price = price;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
