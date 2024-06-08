package day36_inheritance.access.b;

import day36_inheritance.access.a.First;

// Differenr package - different class - but there is INHERITANCE
public class Fouth extends First{
    public static void main(String[] args) {

        First obj = new First();
        System.out.println(obj.one);//since one var has public access modifiers, we can access from anywhere
        //System.out.println(obj.two);
        //System.out.println(obj.three);//
        //System.out.println(obj.four);

        Fouth obj2 = new Fouth();
        System.out.println(obj2.one);//since one var has public access modifiers, we can access from anywhere
        System.out.println(obj2.two); // Since two has protected access modifier, and Since there is IS-A relation being in Differnt packages , Since accessible members from parent can inherit to Child,child class object can have access to it
//      System.out.println(obj2.three);
//      System.out.println(obj2.four);

    }





    /*
    First obj = new First();
        System.out.println(obj.one); // since one var has public access modifiers, we can access from anywhere
        System.out.println(obj.one); // since two var has protec access modifiers, we can access from the same package
        System.out.println(obj.two);// since two var default access modifiers, we can access from the same package
        //System.out.println(obj.four);
     */
}
