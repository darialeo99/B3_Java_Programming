package day42_a_collection.iterate;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIterator {

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList <String>();
        names.add("Tom");
        names.add("Jerry");
        names.add("Micky");
        names.add("Mouse");
        System.out.println(names);

        // To be able to use Iterator, I need to first declare Iterator
        Iterator<String> iterator = names.iterator();

        System.out.println(iterator.next()); // move the cursor/ pin, and return the element
        System.out.println(iterator.next()); // move the cursor/ pin, and return the element
        System.out.println(iterator.next()); // move the cursor/ pin, and return the element
        System.out.println(iterator.next()); // move the cursor/ pin, and return the element
        //System.out.println(iterator.next()); // NoSuchElementException - move the cursor/ pin, and return the element - there is no element anymore, so exception happened
    }
}
