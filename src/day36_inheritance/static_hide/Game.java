package day36_inheritance.static_hide;

public class Game {
    public static void main(String[] args) {

        Sports.cheer(); // calling the cheer method from the Sports class
        System.out.println();
        Soccer.cheer();
        // If there is no same method declared in the child class, it will still call the Parent
        // Is there is the same method declared in the child class, it will depending
        // on whether you are using parent class to call or child class
        // If you use child class to call the same method, the one from parent gets hidden
    }
}
