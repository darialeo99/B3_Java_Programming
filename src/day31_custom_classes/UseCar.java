package day31_custom_classes;

public class UseCar {
    public static void main(String[] args) {

        Car car1 = new Car(); // created the first object
        System.out.println(car1);

        //Car.model = 30; // since it is instance method we can not reach by class name

        car1.model = "Tesla";
        car1.year = 2020;
        car1.fuelLevel = 80.0;
        car1.color = "Red";

        System.out.println();
        System.out.println(car1);

        System.out.println();
        car1.drive();
        car1.drive();
        System.out.println(car1.fuelLevel);

        System.out.println();
        car1.fillTank();
        System.out.println(car1.fuelLevel);

    }
}
