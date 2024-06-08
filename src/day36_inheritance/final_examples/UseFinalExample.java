package day36_inheritance.final_examples;

public class UseFinalExample {
    public static void main(String[] args) {

        FinalExample obj = new FinalExample(4);// calling default constructor
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(FinalExample.PLANET);
        System.out.println("after reassign: ");
        //obj.a = 99; since we have made "a" final we can not change value of final variable
        //obj.b = 909; since we have made "b" final we can not change value of final variable
        //FinalExample.planet = "Mars"; // Since we have made "PLANET" final, we can not change the value/ reassign
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(FinalExample.PLANET);
        System.out.println(obj.PLANET);
        //System.out.println(obj2.planet);// here it is not declared/ created yet

        System.out.println("===========");

        FinalExample obj2 = new FinalExample(6);
        System.out.println(obj2.a);
        System.out.println(obj2.b);
        System.out.println(FinalExample.PLANET);
        System.out.println("after reassign: ");
       // obj2.a = 88;since we have made "a" final we can not change value of final variable
        //obj2.b = 808;since we have made "b" final we can not change value of final variable
       // FinalExample.PLANET = "Saturn"; // since we have made "PLANET" final we can not change value of final variable
        System.out.println(obj2.a);
        System.out.println(obj2.b);
        System.out.println(FinalExample.PLANET);
        System.out.println(obj.PLANET);
        System.out.println(obj2.PLANET);
    }
}
