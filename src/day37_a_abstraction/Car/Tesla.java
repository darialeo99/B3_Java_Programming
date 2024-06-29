package day37_a_abstraction.Car;
// CONCRETE class = non abstract class
public class Tesla extends ElectricCar {

    public void start () {
        System.out.println("Start with the card");

    }

    public void charge () {
        System.out.println("Tesla charging");
    }
}
