package day33_a_static;

public class BestBuy {

    // Instance variable - they belong to object
    String location;

    //Static variable - they belong to Class. Each object shared the same copy of Static variable!
    static String headquarters = "Richfield, 7602 Penn Ave S, United States";
    static int numOfComponSpecialDay = 100;


    // It will be the same for all stores since it's static. So every store will have special day as Wednesday
    static String specialDay = "Wednesday";

    // Making constructor
    public BestBuy (String location) {
        this.location = location;
    }

    //-----------------------------------

    // Instance method
    public void openStore () {
        System.out.println("Opening the location in " + location);
    }

    // static method
    public static void reStock () {
        System.out.println("Today is " + specialDay + ", special day and we are restocking");
        numOfComponSpecialDay = 200;

    }

}
