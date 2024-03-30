package day04_variables;

public class FloatingNumbers {
    public static void main(String[] args) {
        // in java you can not store fractions. ----> 3/4
        System.out.println(3/4); // 0.75

        //how we store decimal numbers: 4.5 , 5.99

        double price = 3.99; // this is the one that is used for decimal numbers almost always (double is a bigger datatype and it there is a bigger range)
                                // it's double by default

        float average = 0.19F;

        System.out.println(price);// here the datatype is double
        System.out.println(average); // here the datatype of float
        System.out.println(4.5); // here the datatype is double by default

    }
}
