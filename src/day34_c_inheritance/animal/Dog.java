package day34_c_inheritance.animal;

public class Dog extends Animal {

    // instance variables
    String type;
    int numberOfLegs;


    public void walk () {
        System.out.println(type + " is walking");
    }

    public void bark () {
        System.out.println(type + " is barking");
    }
}
