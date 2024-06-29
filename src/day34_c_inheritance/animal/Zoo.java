package day34_c_inheritance.animal;

public class Zoo {
    public static void main(String[] args) {


        Animal a1 = new Animal();
        a1.type = "General Animal";
        a1.numberOfLegs = 0;
        a1.walk(); // General Animal is walking
        //a1.roar(); // invalid - parent class can not access child class members
        //a1.bark(); // invalid - parent class can not access child class members


        Dog dog1 = new Dog();
        dog1.type = "German Shepard";
        dog1.walk(); // child class can access to parent class members
        dog1.bark(); // child class can access its own member
        //dog.roar(); // invalid because neither Dog not Animal class has method called roar()



        Lion lion1 = new Lion();
        lion1.type = "Arctic Lion";
        lion1.walk();
        lion1.roar();
        // lion1.bark();

    }

}
