package day38_b_polymorphism.Animal;

public class Lizard extends Reptile {

    String skinColor; // instance variable


    @Override
    public void eat () {
        System.out.println("LIZARD is eating");
    }
}
