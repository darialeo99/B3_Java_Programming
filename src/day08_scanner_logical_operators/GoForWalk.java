package day08_scanner_logical_operators;

public class GoForWalk {
    public static void main(String[] args) {
        // Want to go for a walk
        // We will go for a walk
        //      if it is not raining
        //      and the weather is above 70

        boolean isRaining = false;
        int temperature = 60;

        System.out.println("Go for a walk: " + (!isRaining && temperature > 70));



    }
}
