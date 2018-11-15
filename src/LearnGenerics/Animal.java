package LearnGenerics;

public class Animal {

    private int id;

    Animal(int id){
        this.id = id;
    }

    public void eat(){
        System.out.println("im eat");
    }
    @Override
    public String toString() {
        return String.valueOf(id);
    }

    Animal() {

    }

}
