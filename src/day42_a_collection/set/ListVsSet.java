package day42_a_collection.set;

import java.util.*;

public class ListVsSet {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<Integer>(); // Duplicates are OK, insertion order is kept
        list1.add(4);
        list1.add(10);
        list1.add(1);
        list1.add(2);
        list1.add(-5);
        list1.add(10);
        list1.add(4);
        System.out.println(list1);
        System.out.println(list1.get(0)); // since List, works with indexes, I can get the elements like this.
        System.out.println(list1.get(list1.size() - 1));

        System.out.println("-----------");

        Set<Integer> set = new HashSet<Integer>(); // Duplicates are NOT OK. insertaion order is not kept
        set.add(4);
        set.add(10);
        set.add(1);
        set.add(2);
        set.add(-5);
        set.add(10); // does not allow duplicate
        set.add(4); // does not allow duplicate
        System.out.println(set);
        //System.out.println(set.get(0));
        //System.out.println(set.get(set.size() - 1));
        // Since SET does not have indexes, we can not get the elements in this way

        // Q: How can we get elements?
        // A: we can loop through Set and get the element. Lets say, we want to get element 6

        for (Integer integer : set) {
            if (integer == -5) {
                System.out.println(integer);
            }
        }

        System.out.println("---------------");

        for (Integer integer : set) {
            System.out.println(integer);
        }


        //!: How can I sort my HasSet
        Set<Integer> sortedSet = new TreeSet<>(set);
        System.out.println(sortedSet);

        // Q: Remove duplicates from List
        // - sort - TreeSet
        // - no sort - HashSet, LinkedHashSet
        System.out.println(list1);
        System.out.println(new LinkedHashSet<>(list1)); // removed duplicates

        // Q: You have an array of int: Remove Duplicates and sort them
        Integer [] a = {2,4,23,76,2,345,2,8,4,-3,2,-5};
        // ArrayList <Integer> l = Arrays.asList(a);
        //Set <Integer> s = new TreeSet<>(l); // we could also assign it to a variable, not print the directly
        System.out.println(    new TreeSet<> (Arrays.asList(a) )         ); // printed it directly


        String s = "aaaaabbbbbcccccddddeeeee";
        System.out.println(

                new HashSet<>( Arrays.asList(s.split("") )       )
                        .toString()
                        .replace("[", "")
                        .replace("]", "")
                        .replace(", ", "")

        ); // converting string to array // converted it to List // converted to HashSet

        // Above we converted String to Array
        // then we converted String Array into List of String
        // then we converted List of String into Set of String - which removed duplicates
        // then we did String manipulation to remove "[" , "]" and " , " and printed it






    }






}







