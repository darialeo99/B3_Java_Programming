package day34_a_static;
/*
    Computer - static

    class name: computer:
        instance variables:
            price, brand, color, ...

        static variables: hasScreen, hasBattery, hasMemory

        make objects of the class in a main method and access both instance and static members from proper references

 */
public class Computer {

    // instance variables - each object has its own copy

    double price;
    String brand;
    String color;

    // static variables: hasScreen, hasBattery, hasMemory// shared info with all computers. Every obj of this class wil share the same copy, if it changed in 1 obj it will change in all objects. Static belongs to the Class

    static boolean hasScreen;
    static boolean hasBattery;
    static boolean hasMemory;

    static {

        System.out.println("Running static block");
        hasScreen = false;
        hasBattery = true;
        hasMemory = true;
    }

    // creating constructor

    public Computer (double price, String brand, String color) {

        System.out.println("Running constractor");

        this.price = price; // com1.price = 500.00
        this.brand = brand;
        this.color = color;

    }




}
