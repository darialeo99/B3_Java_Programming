package day16_loops;

public class PrintNumbers {
    public static void main(String[] args) {

        int num = 2;

        // Can you print all the even numbers up until 100 starting from 2

        while (num <= 100){

            System.out.println(num);
            num +=2;

        }

        System.out.println("------------------------------");

        int i = 1;

        while (i <= 100){

            if (i % 2 == 0 ){

                System.out.println(i);
            }

            i++; // we are still incrementing the number though, that's why we have i++ outside of if statement

        }
    }
}
