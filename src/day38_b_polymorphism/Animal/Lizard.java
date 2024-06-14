package day38_b_polymorphism.Animal;

public class Lizard extends Animal {

    String skinColor; // instance variable


    @Override
    public void eat () {
        System.out.println("LIZARD is eating");
    }
}
