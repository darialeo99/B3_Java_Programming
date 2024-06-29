package day31_custom_classes;

import java.security.spec.RSAOtherPrimeInfo;

public class UseCarpet {
    public static void main(String[] args) {

        //Car car1 = new Car(); // created 1 obj for Car class (default constructor)


        Carpet carpet1 = new Carpet (true, 8.5, 12, 2.5); // created 1 obj for Carpet class (default constructor)

        //carpet1.calculatePrice();


        System.out.println(carpet1);

        System.out.println();
        carpet1.length = 14;
        // We had to call .calculatePrice() method again because that method was called in constructor. Since we have updated the length, I am calling the .calculateMethod() to get updated totalPrice
        carpet1.calculatePrice();

        System.out.println();
        System.out.println(carpet1);
    }





}
