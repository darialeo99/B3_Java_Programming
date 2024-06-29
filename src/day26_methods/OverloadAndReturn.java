package day26_methods;

public class OverloadAndReturn {

    public static void method (){
        System.out.println("empty method");
    }

    // I tried to overload the method called "method" by changing only return type
    // this is not acceptable - return type has no effect on method overloading
//    public static void method (){
//        System.out.println("empty method");
//        return 0;
//    }

    public static int method (int a){
        System.out.println("empty method");
        return 0;
    }

    /*
    method overloading
        1. method name has to be the same
        2. parameters
            a. has to be different number of parameters if all the parameters data types are the same
                    method(String str);
                    method (String str, String str2);
            b. has to be different data types if the number of parameters are same
                    method (String str);
                    method (int num);
            c. has to be different order if there number of the parameters are the same
                    method (String str, int num);
                    method (int num, String str);
     */

}
