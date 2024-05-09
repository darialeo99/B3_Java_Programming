package day22_arrays;

import java.util.Arrays;

public class Equals {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        int [] b = {1,2,3,4};
        int [] c = a;

        System.out.println(a==b); // do not use this == to compare arrays

        //This compares two different array objects
        System.out.println(Arrays.equals(a,b)); // use .equals to compare arrays

        System.out.println(a==c); // do not use == tp compare arrays
                                  // in this case, it will be true because a and c both point to same array object


        boolean result = Arrays.equals(b,c); // true
        System.out.println(result);

        int [] d = {4,3,2,1};
        System.out.println(Arrays.equals(a,d)); // false
        Arrays.sort(d);
        System.out.println(Arrays.equals(a,d)); // true


    }
}
