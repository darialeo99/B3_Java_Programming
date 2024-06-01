package day33_b_encapsulation.access_modifiers;

public class AccessModifiers {

    public int a; // instance variable - public access modifier
    int b;       // instance variable - default access modifier
    private int c; // instance variable - private access modifier



    public static int x;  // static variable - public access modifier
    static int y;  //        static variable  - default access modifier
    private static int z; // static variable- private access modifier


    // in the same class - same package (Automatically in the same package)
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();

        // since it is in the same class and package we can access - public, default and private

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        // since it is in the same class and package we can access - public, default and private
        System.out.println(AccessModifiers.x);
        System.out.println(AccessModifiers.y);
        System.out.println(AccessModifiers.z);


    }

}
