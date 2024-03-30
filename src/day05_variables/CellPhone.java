package day05_variables;

public class CellPhone {
    public static void main(String[] args) {
        String brand = "Apple";
        String model = "Iphone 14 Pro";
        String color = "Purple";
        double price = 799.99;
        int storage = 256;
        boolean hasCamera = true;
        char sim = 'A';


        System.out.println("I have an " + model + "from " + brand);
        System.out.println("It came in the color " + color + "and it has " + storage + "GB");
        System.out.println("For the sim type " + sim + " with a camera: " + hasCamera + " the total price is " + price);

    }
}
