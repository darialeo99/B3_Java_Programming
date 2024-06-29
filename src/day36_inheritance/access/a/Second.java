package day36_inheritance.access.a;

public class Second {
//  Same package, different class
    public static void main(String[] args) {

        First obj = new First();
        System.out.println(obj.one); // since one var has public access modifiers, we can access from anywhere
        System.out.println(obj.two); // since two var has protec access modifiers, we can access from the same package
        System.out.println(obj.three);// since two var default access modifiers, we can access from the same package
        //System.out.println(obj.four); // // since four var private access modifiers, it can only be accessed from the same Class


        Second obj2 = new Second ();

        // Since there is no relation between the class which has members called one,two, three, four
        // we can not access

        // Since second class has no members called one. two, three four we can not access

//       obj2.one;
//       obj2.two;
//       obj2.three;
//       obj2.four;



    }
}
