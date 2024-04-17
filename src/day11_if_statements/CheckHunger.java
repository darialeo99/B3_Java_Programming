package day11_if_statements;

import java.util.Scanner;

public class CheckHunger {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Are you hungry? [true / false]");
        boolean isHungry = input.nextBoolean();

        // Approach #1 - single if statement

        if (isHungry){
            System.out.println("YOU ARE HUNGRY. SO i WILL GET SOME FOOD FOR YOU");

        }

        if (!isHungry){
            System.out.println("Great, then practice Java");

        }

        // Approach # 2- if / else statement

        if (isHungry){
            System.out.println("YOU ARE HUNGRY. SO i WILL GET SOME FOOD FOR YOU");
        }else{
            System.out.println("Great, then practice Java");

        }
    }

}
