package day38_b_polymorphism.Animal;

public class Reptile extends Animal {

    int numOfLegs; // instance variable


    @Override
    public void eat () {
        System.out.println("REPTILE is eating");
    }
}
