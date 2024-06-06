package day34_b_encapsulation;

import my_utilities.StringUtil1;

import java.util.Arrays;


// Anything static we usually use STATIC class name
public class Normal {
    public static void main(String[] args) {

        int [] a = {81, 23, 65, 33};
        Arrays.sort(a);
        //sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println(Math.PI);
        //System.out.println(PI);

        System.out.println(StringUtil1.reverse("java"));
        //System.out.println(reverse("java"));
    }
}
