package day27_wrapper_arraylist;

import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList();
        System.out.println(list.size());

        System.out.println(list);
        // Lets add some data in it
        list.add("water");
        //list.add(3) // invalid because the datatype of my ArrayList is String
        list.add("bread");
        list.add("juice");
        list.add("fruit");
        System.out.println(list); // [water, bread, juice, fruit]

        list.add(1, "rice"); // overloaded version// add (int index, element to add)
        System.out.println(list); // [water, rice, bread, juice, fruit]

        list.remove(0);
        System.out.println(list); // [rice, bread, juice, fruit]

        System.out.println(list.remove(0)); // we return whatever was removed
        System.out.println(list); // [bread, juice, fruit]

        // remove the last index

        list.remove(list.size()-1);
        System.out.println(list); // [bread, juice]

        // list.remove(12); // Index 12 out of bounds for length 2

        // Remove by element

        list.remove("juice");
        System.out.println(list ); // [bread]

        System.out.println(list.remove("water")); // Will return False since there is no match in the ArrayList

        list.add("banana");
        list.add("banana");
        System.out.println(list); // [bread, banana, banana]

        list.remove("banana"); // It will remove first MATCHED one.
        System.out.println(list); // [bread, banana] , if the element existed in ArrayList multiple times, it removes the First Match.

    }
}
