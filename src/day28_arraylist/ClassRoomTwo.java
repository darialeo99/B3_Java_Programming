package day28_arraylist;

import java.sql.Array;
import java.util.ArrayList;

public class ClassRoomTwo {
    public static void main(String[] args) {

        ArrayList <String> group = new ArrayList<>(); // capacity 10 -- but the size 0
        System.out.println(group.size());
        System.out.println(group.isEmpty());
        System.out.println(group.contains("Hello"));
        System.out.println(group); // [];

        group.add("Tom");
        group.add("Micky");
        System.out.println(group); // ArrayList maintains the insertion order + all elements are indexed

        System.out.println(group.get(0));
        System.out.println(group.get(1));
        //System.out.println(group.get(2)); // Index 2 out of bounds for length 2

        group.add(0, "Winnie");
        System.out.println(group);
        System.out.println(group.get(0));

        //group.add(5, "Winnie"); //IndexOutOfBoundsException
        System.out.println(group.get(group.size() - 1));





    }
}
