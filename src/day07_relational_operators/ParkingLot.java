package day07_relational_operators;

public class ParkingLot {
    public static void main(String[] args) {
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

// this is about division and modules differences
        System.out.println("############");
        int a = 10;
        System.out.println(a % 3); // 10 / 3 ====> 3.3333 ----> 9/3 ----> is divisible, so the whole amount
                                   // 10 % 3 ====> .333333 ---> 1 is not divisible, so it's a reminder
    }
}
