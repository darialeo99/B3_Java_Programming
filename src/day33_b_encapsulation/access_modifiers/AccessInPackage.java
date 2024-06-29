package day33_b_encapsulation.access_modifiers;

public class AccessInPackage {

    // In the different class - same package
    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();

        // since it is in the same class and package we can access - public, default and private

        System.out.println(obj.a);
        System.out.println(obj.b);
        //System.out.println(obj.c);


        // since it is in the same class and package we can access - public, default and private
        System.out.println(AccessModifiers.x);
        System.out.println(AccessModifiers.y);
        //System.out.println(AccessModifiers.z);

        /**
         * NOTE:
         * C and z variables are "Private" variables.
         * That is why they are only accessible in the same class
         * In here, since we are in a different class , we can not access them
         */


    }
}
