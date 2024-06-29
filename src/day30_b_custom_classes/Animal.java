package day30_b_custom_classes;

public class Animal {

    // INSTANCE VARIABLES

    String species;
    long population;


    // This is a SPECIAL method, this will help us to print object directly


    // If method does not have STATIC you can not call it by Class name. If it does not have static word, it becomes INSTANCE METHOD. We must call it by object/ object reference
    // Once we print the Object directly, it will call this method behind scene
    // If you do not have this method declared, it will print some memory location
    public String toString (){
        String print = "Species: " + species + "\nPopulation " + population;
        return  print;
    }

}
