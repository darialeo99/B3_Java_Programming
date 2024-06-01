package day33_a_static;

public class BestBuyStores {
    public static void main(String[] args) {

        BestBuy store1 = new BestBuy("Fairfax, VA");
        BestBuy store2 = new BestBuy("Bergenfield, NJ");
        BestBuy store3 = new BestBuy("Boston, MA");

        //System.out.println(BestBuy.location); // NOT VALID = for instance variables
        System.out.println(BestBuy.headquarters);
        System.out.println(store1.headquarters);
        System.out.println(store2.headquarters);
        System.out.println(store3.headquarters);

        System.out.println();

        store1.headquarters = "Tysons, 123 Test St, VA, United States";
        store3.location = "Manhattan, NY";
        System.out.println(BestBuy.headquarters);
        System.out.println(store1.headquarters);
        System.out.println(store2.headquarters);
        System.out.println(store3.headquarters);

        System.out.println();
        System.out.println(store2.location);
        store3.headquarters = "Chantily, 987 Check Dr, VA US";
        System.out.println(store1.location);
        System.out.println(store2.location);
        System.out.println(store3.location);

        System.out.println(store1.headquarters); // We can still call static by object but it is not a good practice
        System.out.println(store2.headquarters);
        System.out.println(store3.headquarters);
        System.out.println(BestBuy.headquarters); // Anything static should be called by Class name

        System.out.println("------------------------------------");
        store1.openStore();
        store2.openStore();
        store3.openStore();

        System.out.println("------------------------------------");

        BestBuy.reStock(); // Good practice calling static
        store1.reStock(); // You can still static method by Object reference but it is not a good practice
        System.out.println(store1.numOfComponSpecialDay);
        System.out.println(store2.numOfComponSpecialDay);
        System.out.println(store3.numOfComponSpecialDay);


    }
}
