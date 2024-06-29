package day39_a_polymorphism.car;

public class Car {


}


class BWM extends Car {}


class Tesla extends Car {}


class Camry extends Toyota {}
class Toyota extends Car {}

class LandRover extends Car {}

class Ford { }

class DealerShip {

    //method

    public static void lease (Car car) {
        System.out.println("Leasing a car: " + car.getClass().getName());

    }

    //,getClass --> coming from Object class
    //Since Object is the parent of all classes, all accessible things inherited to child classes

    public static Car getCar (int option) {
        if (option == 1) {
            return new Toyota();
        }else if (option == 2) {
            return new Tesla();
        }//else if (option == 3) {
           // return new Ford(); // No IS-A relation
        else {
            return new Car();
        }
    }


}

class LocationA extends DealerShip {

    // Return COVARIANT
    public static Camry getCar (int option) {
        if (option == 1) {
            return (Camry) new Toyota();
        //}else if (option == 2) {
        //    return new Tesla();
        }//else if (option == 3) {
        // return new Ford(); // No IS-A relation
        else {
            return new Camry();
        }
    }

}


class Runner {
    public static void main(String[] args) {

        Car car = new Car();
        DealerShip.lease (car);

        Tesla tesla = new Tesla();
        DealerShip.lease (tesla);


        DealerShip.lease (new LandRover());

        DealerShip.lease (new Toyota());

        System.out.println("----------------");

        Car car2 = DealerShip.getCar (1); // Car = new Toyota();
        Car car3 = DealerShip.getCar (2); //  Car = new Tesla();
        Toyota t = (Toyota) DealerShip.getCar(1);  // Car = new Toyota(); // Explicit casting



    }
}