package day37_a_abstraction.Car;

public class Garage {
    public static void main(String[] args) {

        //Car obj1 = new Car(); // we can not create the object of ABSTRACT CLASS
        //obj1.start();

        Toyota obj2 = new Toyota();
        obj2.start();

        Honda obj3 = new Honda();
        obj3.start();


        // Both Toyota nad Honda re CONCRETE classess
        // Because they not abstract class, we had to implement abstract methods from abstract classes

        //ElectricCar electricCar = new ElectricCar(); we can not create obj of abstract class

        System.out.println("------------");

        Tesla obj5 = new Tesla();
        obj5.start();
        // .start(); it was Defined in Car Class but implemented in Tesla class
        obj5.charge();
        // . charge(); it was Defined in ElectricCar Class but implemented in Tesla class

        // Tesla is a non-Abstract class (Concrete class), so it was required to implement ALL abstract methods from all abstract parent classes
    }
}
