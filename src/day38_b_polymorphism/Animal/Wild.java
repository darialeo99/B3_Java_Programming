package day38_b_polymorphism.Animal;

public class Wild {

    public static void main(String[] args) {

        // #1 - all possible reference / object - Lizard
        // Reference Itself

        Lizard l1 = new Lizard();
        l1.eat();
        l1.name = "Lizard";
        l1.numOfLegs = 10;
        l1.skinColor = "Camo";
        System.out.println(l1.name);
        System.out.println(l1.numOfLegs);
        System.out.println(l1.skinColor);

        System.out.println("----------------");

        // Reference = Parent
        Reptile l2 = new Lizard(); // bare new object
        l2.eat(); // in your reference Replile you need to have access to eat(); method
        l2.name = "Lizard2";
        l2.numOfLegs = 12;
        //l2.skinColor = "Camo2"; // Reptile reference does not have access to skinColor variable
        System.out.println(l2.name);
        System.out.println(l2.numOfLegs);
        //System.out.println(l2.skinColor); // Reptile reference does not have access to skinColor variable

        System.out.println("--------------------");


        // Reference - Grand parent
        new Lizard(); //new obj
        Animal l3 = new Lizard();
        l3.eat(); // in your reference Replile you need to have access to eat(); method
        l3.name = "Lizard3";
        //l3.numOfLegs = 14; // Animal reference does not have access to numOfLegs variable
        //l3.skinColor = "Camo2"; // Reptile reference does not have access to skinColor variable
        System.out.println(l3.name);
       // System.out.println(l3.numOfLegs); //// Animal reference does not have access to numOfLegs variable
        //System.out.println(l3.skinColor); // Reptile reference does not have access to skinColor variable


        // #2 --  all possible reference / object - Reptile

        // Reference itself = Reptile
        // Reference Parent - Animal
        Animal r1 = new Reptile();
        //1.numOfLegs = 20;


        /**
         * We created 3 objects of Lizard
         * 1 - Reference was Itself Lizard
         * 2 - Reference was Parent class - Reptile
         * 3 - Reference was Grand Parent class - Animal
         */


//        //#2 - all possible reference / object - Reptile
//        Reptile r1 = new Reptile();
//        r1.eat();
//        r1.name = "Reptile";
//        System.out.println(r1.name);
//
//
//        System.out.println("----------------");
//
//
//        // Reference Super/ Parent
//        Animal l2 = new Lizard();
//        l2.eat(); // reach the eat() method from parent but run the version from object
//        // if child does not have overriden version of eat(), then it will run the one from parent
//        // the reference side determines accessibility
//        Animal r2 = new Reptile();
//        r2.eat();

    }
}
