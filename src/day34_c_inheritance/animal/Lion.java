package day34_c_inheritance.animal;

public class Lion extends Animal {

    // instance variables
    String type;
    int numberOfLegs;

    public void walk () {
        System.out.println(type + " is walking");
    }

    public void roar () {
        System.out.println(type + " is roaring");
    }
}
