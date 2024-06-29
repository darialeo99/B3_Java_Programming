package day36_inheritance.access.b;

import day36_inheritance.access.a.First;
// Different package , different class
public class Third {
    public static void main(String[] args) {

        First obj = new First();
        System.out.println(obj.one); //since one var has public access modifiers, we can access from anywhere from the project
        //System.out.println(obj.two);// since two has protected access modifier, and since there is IS-A relation between Third Class and First Class and since these two classes are in different packages, we can not have access
        //System.out.println(obj.three); // since three var default access modifiers, we can access from the same package. In here, since it is a different package, we can not access
        //System.out.println(obj.four); // since four var private access modifiers, it can only be accessed from the same Class

       Third obj2 = new Third();


        // Since there is no relation between the class (First) which has members called one,two, three, four
        // we can not access
        // Since Third class has no members called one. two, three four we can not access
//       obj2.one;
//       obj2.two;
//       obj2.three;
//       obj2.four;

    }
}
