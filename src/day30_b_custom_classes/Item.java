package day30_b_custom_classes;

public class Item {

    // MAKE INSTANCE VARIABLES. It's my blue print. Each obj will have its owb copy of this

    String name;
    double price;

    // This is the Special method
    // Helps to print / get into the object directly

    @Override // If you want you can remove this "Override" text
    public String toString() {
        return "Item: " +
                "\n\tprice: " + price +
                "\n\tname: " + name;
    }


}
