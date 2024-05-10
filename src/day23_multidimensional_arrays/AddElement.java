package day23_multidimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        /*
    Have a starting array
    you want to add a number to the end
    so make your array bigger to store the new number

    Ex:
        {45, 123, 62}
        adding 100
        {45, 123, 62, 100}
 */

        Scanner key = new Scanner(System.in);
        System.out.print("How many elements in your first array you want to have: ");
        //int firstArraySize = key.nextInt(); the same as below
        int [] firstArray = new int [key.nextInt()]; //3

       // System.out.println("Please enter your number of elements one by one pressing enter");
        for (int i = 0; i < firstArray.length ; i++) {
            System.out.print("Enter your data/ value: ");
            firstArray[i] = key.nextInt();

        }

        System.out.println("First Array: " + Arrays.toString(firstArray));

        System.out.println("How many more elements do you want to add to the First Array");
        int numsToAdd = key.nextInt(); // 2
        int [] secondArray = Arrays.copyOf(firstArray, firstArray.length + numsToAdd);

        for (int i = firstArray.length; i < secondArray.length; i++) { // [23, 66, 77, _, _]
            System.out.println("Enter youe data/ value to add: ");
            secondArray[i] = key.nextInt();

        }
        System.out.println("Second Array: " + Arrays.toString(secondArray));









    }
}
