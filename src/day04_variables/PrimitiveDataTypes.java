package day04_variables;
/*
    Data Types:
        Primitive - total 8
            integer types:          byte - short - int - long
            floating:               float - double
            character:              char
            true/false:             boolean
       Non-Primitive
            String:                 Multiple characters
 */
public class PrimitiveDataTypes {
    public static void main(String[] args) {
        //System.out.println(5);
        //System.out.println(5.6);

        byte age = 60; // variable declaration and assignment statement
        System.out.println(age); //datatype here is: byte
        System.out.println(60); // datatype here is: int

        //byte age2 = 200; // 200 is too big for byte datatype

        short year; // declared a variable called year which has datatype "short"
        year = 2024; // here I assigned a value 2024 into my variable called "year"

        System.out.println(year); // datatype here is short
        System.out.println(2024); // datatype here is: int

        int addressNumber = 244432; // declared a variable called addressNumber and assigned 244432 into a variable
        System.out.println(addressNumber); // datatype here is int
        System.out.println(244432);// datatype here is :int

        long bigNumber;
        bigNumber = 9534895898L; // adding L to the end of number, tells the compiler that it is a long number






    }
}
