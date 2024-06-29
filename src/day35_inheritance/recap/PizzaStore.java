package day35_inheritance.recap;

public class PizzaStore {
    public static void main(String[] args) {

        // I do not want to assign it directry here
        Pizza p1 = new Pizza("Hello", 6); // small,medium,large,xlarge
        //p1.size = "Hello"; // since it is encapsulated, can not reach directly (private)

        System.out.println(p1);

        Pizza p2 = new Pizza("Medium", 6);
        System.out.println(p2);



    }
}
