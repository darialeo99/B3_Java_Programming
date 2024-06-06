package day34_b_encapsulation;

// Import all static things in util package specifically Arrays class
// If you do static import, all the non-static things are not accessible

import my_utilities.ArrayUtil;

// If you do not want to use Static class names, I have another option for you, instead of using class names, you can IMPORT STATIC and call them DIRECTLY

// static imports
import static my_utilities.StringUtil1.*;
import static my_utilities.ArrayUtil.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class WithImport {
    public static void main(String[] args) {


        int [] a = {81, 23, 65, 33};
        //Arrays.sort(a);
        sort(a);

        //System.out.println(Math.PI);
        System.out.println(PI);

        //System.out.println(StringUtil1.reverse("java"));
        System.out.println(reverse("java"));

        minNumInArr(a);


        // System.out.println(toString(a)); // Since this is a special method, sometimes it is instance method, that is why Java here does know if it is static version



    }
}
