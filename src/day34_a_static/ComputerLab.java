package day34_a_static;

public class ComputerLab {
    public static void main(String[] args) {
         // new obj

        Computer comp1 = new Computer(500.00, "HP", "Silver");

        Computer.hasBattery = false;

        System.out.println(Computer.hasBattery);

        Computer comp2 = new Computer(400.00, "Dell", "Black");

        System.out.println(comp1.hasBattery);
        System.out.println(comp2.hasBattery);

        comp2.hasBattery = true; // You can access static variables with ibj reference but its not a good practice

        System.out.println(comp1.hasBattery);
        System.out.println(comp2.hasBattery);





    }
}
