package day21_arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        String str = "Chicago NewYork Houston Denver Pittsburgh";


        // I have declared 5 different Strings -> meaning 5 different containers
        String city1 = "Chicago";
        String city2 = "NewYork";
        String city3 = "Houston";
        String city4 = "Denver";
        String city5 = "Pittsburgh";

        // Array Intro


        // or String cities [] - another way to declare Array

       //I have declared String array that holds  Chicago NewYork Houston Denver Pittsburgh
        String [] cities = {"Chicago", "NewYork" , "Houston" , "Denver", "Pittsburgh" };

        // How to access each element in the array?
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);


        // How to print all cities using indexes
        System.out.println("All cities: " + cities[0] + ", " + cities[1] + ", " + cities[2] + ", " + cities[3] + ", " + cities[4]);
        System.out.println("All cities in reversed order: " + cities[4] + ", " + cities[3] + ", " + cities[2] + ", " + cities[1] + ", " + cities[0]);


        // how can I print all Array
        System.out.println(cities); // [Ljava.lang.String;@77b52d12  ---> this does not print all array, gives some hashcode - kind of memory location
        System.out.println(Arrays.toString(cities) ); // We use Arrays class from java.util package that has a method called .toString(array); which helps to print array

        // How can I get rid of square brackets [] in output - you can assign to String or you can do it in print statement directly
        String convertArr = Arrays.toString(cities).replace("," , "");
        System.out.println(convertArr.substring(1,convertArr.length()-1));
        System.out.println(convertArr); // This will print ---> [Chicago NeyYork Houston Denver Pittsburgh]


        // How do I know, how many elements we have in array?

        System.out.println(cities.length);

        // I have declared String array that holds variables
        // String [] cities2 = {city1, city2, city3, city4, city5}







    }
}
