package day38_a_abstraction_interface.shopping;

public class Runner {
    public static void main(String[] args) {

        // Can I create object of Shopping, Shipping, OnlineShopping
        // NO, because Shopping is abstract class
        // NO, because OnlineShopping is abstract class
        // NO, because Shipping is interface

        // Can i make object of Target

        Target target = new Target();
        target.price = 10;
        System.out.println(target.price);
        target.buyItem();
        target.returnItem();

        //target.payForShipping(true); // No relation (does not implement), no access

        System.out.println("----------------");

        Amazon amazon = new Amazon();
        amazon.price = 100;
        System.out.println(amazon.price);
        amazon.payForShipping(true);
        amazon.buyItem();
        amazon.viewCart();
        amazon.returnItem();

        System.out.println("--------------");

        System.out.println(amazon.COUNTRY); // not good practice to use obj name to reach static
        System.out.println(Shipping.COUNTRY); // good way to use
        System.out.println(Amazon.COUNTRY); // good way to use
        System.out.println(OnlineShopping.COUNTRY); // good way to use


    }
}
