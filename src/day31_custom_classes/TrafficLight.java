package day31_custom_classes;

public class TrafficLight {

    String color;


    // Constructor which accepts one argument
    //Constructor helps to create obj and assign and initialize instance variable

    // Once you create a custom constructor there is NO MORE default contractor
    // I can have multiple constructors in a class. The same idea as Method overloading
    public TrafficLight (String startColor){ // argument// String startColor is Instance variable
        // startColor = "Yellow" (the line above)
        color = startColor; // color = "Yellow"

    }
}

