package day38_a_abstraction_interface.shopping;

public final class Amazon extends OnlineShopping{

    @Override
    public void viewCart() {
        System.out.println("Viewing Amazon cart");
    }

    @Override
    public void payForShipping(boolean hasPrime) {
        System.out.println(hasPrime ? "No cost for shipping" : "Paying for shipping");

    }

    @Override
    public void buyItem() {
        System.out.println("Buying item from Amazon");

    }

    @Override
    public void returnItem() {
        System.out.println("Returning item to Amazon drop Location");

    }

    // Amazon IS-A OnlineShopping
    // Amazon IS-A Shopping
    // Amazon IS-A Shipping
}
