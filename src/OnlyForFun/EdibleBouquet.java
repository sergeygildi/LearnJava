package OnlyForFun;

abstract class EdibleBouquet implements Product {

    String name;
    float price;

    public EdibleBouquet() {
    }

    public EdibleBouquet(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public EdibleBouquet(float price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
