package my_utilities;

import day33_b_encapsulation.access_modifiers.AccessModifiers;

public class AccessOutsidePackage {

    // In the different class - different package

    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();

        // since it is in the same class and package we can access - public, default and private

        System.out.println(obj.a);
        //System.out.println(obj.b);
        //System.out.println(obj.c);

        // since it is in the same class and package we can access - public, default and private
        System.out.println(AccessModifiers.x);
        //System.out.println(AccessModifiers.y);
        //System.out.println(AccessModifiers.z);

        /**
         * NOTE:
         * C and z variables have "Private" access modifiers.
         * That is why they are only accessible in the same class
         * In here, since we are in a different package , we can not access them
         *
         *
         *
         *b and y variables have "Default" access modifiers
         * That is why they are ONLY accessible in the same package
         * In here, since we are in a different package , we can not access them
         */


    }
}
