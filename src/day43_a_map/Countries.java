package day43_a_map;

import java.sql.SQLOutput;
import java.util.*;

public class Countries {

    public static void main(String[] args) {


        // Map works with --> KEY : VALUE
        // KEY : VALUE (ENTRY) -> data has to be PRIMITIVE (Object Type)

        // String, "String, String, String"
        // I created a Hashmap that has:
        //                  KEY of String type (countries)
        //                  VALUE of ArrayList of String (cities)
        Map < String, ArrayList <String> > countries = new HashMap<>();
        countries.put("United States" , new ArrayList <> (Arrays.asList("New York" , "New Jersey", "Virginia", "Boston")));
        countries.put("France", new ArrayList<>(Arrays.asList("Lyon", "Paris")));
        countries.put("Canada", new ArrayList<>(Arrays.asList("Toronto", "Vancouver" , "Ontario")));

        // How do i print

        System.out.println(countries);

        System.out.println("------------------");
        // Print all cities which has "i" in it

        for (String eachListOfCities : countries.keySet()) { // This will loop through the all KEYS, I will get each key 1 by 1
            System.out.println(countries.get(eachListOfCities));

            for (String eachCity : countries.get(eachListOfCities)) { // this will loop through the elements of each ArrayList value
                if (eachCity.contains("i")) {
                    System.out.println(eachListOfCities);
                }

            }


           // System.out.println(countries.get(each));
        }

        System.out.println("------------------");

        for ( ArrayList <String> eachList : countries.values()) {

            for (String eachCity : eachList) {
                if (eachCity.contains("i")) {
                    System.out.println(eachCity);
                }
            }

        }
        System.out.println("--------------");


        // Ask a user which city they want to visit?
        System.out.println("Which city do you want to visit?");
        Scanner input = new Scanner(System.in);
        String userWishCity = input.nextLine();

        // if the city is in our tour, we can say: "We have a flight on Sunday". If not, raise an exception.

        for (ArrayList <String> CityList : countries.values()) {

            if (CityList.contains(userWishCity)) {
                System.out.println("We have a flight on Sunday to " + userWishCity);
            }
//            for (String eachCity : CityList) {
//                if (eachCity.equals(userWishCity)) {
//                    System.out.println("We have a flight on Sunday to " + userWishCity);
//                    //break;
//
//                }
//            }

        }


    }




}
