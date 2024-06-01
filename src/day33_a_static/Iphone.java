package day33_a_static;

public class Iphone {

    // Instance variables
    String model;
    double price;

    // static variable
    static String company;
    static String os;
    static boolean appleDay;
    static String day;


    // Custom constructor
    public Iphone (String model, double price) {
        this.model = model;
        this.price = price;
    }


    // static block - static initialization // static block will be run first when you call the class. It will be the same for all the objects
    static {
        System.out.println("Static Block run: ");
        company = "Apple";
        os = "iOS";
        // model = "Ip"; // static can ACCEPT ONLY static
        day = "Wednesday";

        if(day.equals("Friday")) {
            appleDay = true;
        }
    }

    // Instance method
    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=$" + price +
                '}';
                // "Company" + company; // Instance can ACCEPT both - static and instance
    }
}
