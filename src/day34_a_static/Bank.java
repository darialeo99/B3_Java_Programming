package day34_a_static;

public class Bank {

    public static void main(String[] args) {

        System.out.println(DebitCard.accountType); // Checking

        DebitCard dc1 = new DebitCard(1234567890123456L, "Micky Mouse", 100_000.00 );
        System.out.println(dc1);


        // Create multiple objects also with INVALID inputs.
        DebitCard dc2 = new DebitCard(123456123456L, "Micky Mouse", 100_000.00 );



        DebitCard dc3 = new DebitCard(123456123456L, "Micky Mouse", "AMEX", 12345, 100_000.00 );



    }
}
