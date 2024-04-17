package day07_relational_operators;

public class RelationalOperatorExample {
    public static void main(String[] args) {
        System.out.println(10 > 5); //
        System.out.println(10 < 5);

        int a = 5;
        int b = 3;

        System.out.println(a > 3);
        boolean aAndB = a < b;
        System.out.println(aAndB);

        System.out.println(6 >= 6);
        System.out.println(6 < 6);

        System.out.println(4 == 4); // == this is comparing is it is equal
        System.out.println(4 != 4);
        System.out.println(3 != 1);

        System.out.println();

        int cars = 10;
        System.out.println("Parking lot has " + cars);
        // 1 car drove in
        //cars = cars + 1;
        // or
        //cars++;
        //++cars;
        //System.out.println("Parking lot has " + cars);
        //or
        System.out.println("Parking lot has " + ++cars);


    }
}
