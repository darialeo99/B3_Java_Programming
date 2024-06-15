package day39_a_polymorphism.cloth;

public class Store {

    public static void main(String[] args) {

        // Possible reference of TShirt
        // #1 - Itself

        TShirt t1 = new TShirt();
        t1.wear();

        // #2 - Parent class

        Clothes t2 = new TShirt();
        t2.wear();

        System.out.println("------------------");

        // Possible reference of Jacket
        // #1 - Itself

        Jacket j1 = new Jacket();
        j1.wear();
        j1.putOnHood();

        // #2 - Parent class
        Clothes j2 = new Jacket();
        j2.wear();
        //j2.putOnHood(); // Clothes reference does not have access to pulOnHood(); method


        // #3 -Interface

        HasHood j3 = new Jacket();
        //j3.wear(); HasHood reference does not have access to wear(); method
        j3.putOnHood();

        // #2 - Object
        Object j4 = new Jacket();
        //j4.wear(); // Object reference does not have access to wear(); method
        //j4.putOnHood(); // Object reference does not have access to putOnHood(); method

        System.out.println("-------------------");

        TShirt ts = new TShirt();

        Jacket jt = new Jacket();
        //References Itself -> Jacket ts = new Jacket();
        // Reference Parent --> Clothes ts = new Jacket();
        // References Interface --> HasHood ts = new Jacket();

        // References -> TShirt, Clothes

        buy(ts); // buy( new TShirt() );
        buy(jt);
        buy(new TShirt());
        buy(new Jacket());

        HasHood jj3 = new Jacket();
        buy( (Jacket)jj3) ; //  HasHood jj3 = new Jacket(); -- > Jacket jj3 = new Jacket();
        //buy( (jj3) ); //  HasHood jj3 = new Jacket(); -- > Clothes close cannot accept HasHood jj3



    }

    public static void buy (Clothes clothes) { // Clothes clothes = new TShirt();

        // Clothes clothes = new TShirt();  --> new TShirt(); is instanceOf TShirt
        // Clothes clothes = new Jacket (); ---> new Jacket(); is instanceof TShirt
        if (clothes instanceof TShirt) {
            System.out.println("Bought TShirt");
        } else if (clothes instanceof Jacket) {

            // Clothes clothes = new Jacket (); ---> new Jacket(); is instanceof Jacket
            System.out.println("Bought a Jacket");
        }
    }


}
