package day19_nested_loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {


        Scanner key = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = key.nextInt(); // 7    ---> 1,2,3,4,5,6,7 if this number is divisible with all numbers up until itself
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                count++;

            }
            //System.out.println(i);

        }

        if (count == 2){ // the reason we check it against 2 is because prime number can be divisible only two times
            System.out.println(num + " is prime number");
        }else {
            System.out.println(num + " is NOT prime number");
        }
    }
}
