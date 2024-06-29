package day24_methods;
/*
    unlock car
    open the door
    sit in the car
    close the door
    put the seatbelt on
    start the engine
    out into drive and go
 */
public class Car {
    public static void unlockCar(){
        System.out.println("Unlocking the car");
    }

    public static void openDoor() {
        System.out.println("Opening the door");
    }

    public static void getInTheCar(){
        System.out.println("Sitting in the car");
        System.out.println("Closing the door");
    }

    public static void getReady(){
        System.out.println("Put the seatbelt on");
        System.out.println("Check the mirrors");
        System.out.println("Put the music on");
        System.out.println("Put the nagivation on");
    }

    public static void startCar(){
        System.out.println("Starting the car");
    }

    public static void driveAndGo(){
        System.out.println("Putting gear into D mode");
        System.out.println("Press gas to go forward");

    }

    public static void goInHurry(){
        unlockCar();
        openDoor();
        getInTheCar();
        startCar();
        driveAndGo();
    }






    public static void main(String[] args) {
        unlockCar();
        unlockCar();
        unlockCar();
        openDoor();
        getInTheCar();
        getReady();
        startCar();
        driveAndGo();

        System.out.println("---------");
        goInHurry(); // one full method that did multiple things, starts on line 42
        goInHurry(); // one full method that did multiple things , starts on line 42

    }

}
