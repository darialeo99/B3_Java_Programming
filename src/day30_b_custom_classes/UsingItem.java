package day30_b_custom_classes;

public class UsingItem {
    public static void main(String[] args) {

        Item item1 = new Item();
        item1.name = "Apples";
        item1.price = 4.99;

        System.out.println(item1); // it will give memory location, not value

        Item item2 = new Item();
        System.out.println(item2); // // it will give memory location, not value

        System.out.println("----------------");
        System.out.println(item1.toString());





    }
}
