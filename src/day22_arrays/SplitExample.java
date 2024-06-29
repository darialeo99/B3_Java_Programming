package day22_arrays;

import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {

        String str = "monday tuesday wednesday thursday friday saturday sunday";

        String [] days = str.split(" "); // we are splitting this Array by " " space and printing our each day separately
        System.out.println(Arrays.toString(days));
        for (String each: days){
            System.out.println(each);
        }

        String [] withoutDay = str.split("day");
        System.out.println(Arrays.toString(withoutDay));

        for (String each : withoutDay){
            System.out.println(each);
        }

        System.out.println("-----------------");

        String str3 = "Jan-Feb-Mar_Apr-May-Jun-Jul-Sep_Oct_Nov_Dec";
        String [] arr1 = str3.split("-");

        for (String each : arr1){
            System.out.println(each);
        }

        System.out.println("--------------");
        String str4 = "Hello world!";
        String [] all = str4.split(""); // similar to charArray, it will print all letters separately. But it will be String Array in this case (NOT CHAR)

        for (String each : all){
            System.out.println(each);
        }

        System.out.println();
        String str5 = "It is a break time";
        String [] arr = str5.split("-");

        for (String each: arr){
            System.out.println(each);
        }

    }
}
