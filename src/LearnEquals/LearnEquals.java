package LearnEquals;

public class LearnEquals {
    public static void main(String[] args) {


    }


}

class Animal {

    private int id;

    /**
     * TODO Как переопределить метод equals?
     * Сравниваем объекты по id;
     **/
    @Override
    public boolean equals(Object obj) {
        Animal animal = (Animal)obj;
        return this.id == animal.id;
    }


}
