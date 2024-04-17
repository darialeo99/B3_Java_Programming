package day06_a_arithmetic_operators;

public class TypeCasting {
    public static void main(String[] args) {

        byte b = 40;
        int i = b; // the byte value is AUTOMATICALLY CONVERTED into int, because is SMALLER than int

        int i2 = 100;
        byte b2 = (byte)i2; // int is BIGGER than byte, so we must CAST. We CAST the int type variable -  i2 to a byte type variable using (byte)
        System.out.println(i2);
        System.out.println(b2);// this will be same 100 because byte type can hold the MAC 127 so there will NOT be data loss

//        int i3 = 130;
//        byte b3 = (byte)i3;
//        System.out.println(i2);
//        System.out.println(b3);// this will not print 150 because byte can hold MAX 127so there will be data loss
//
//        //byte b3 = 100; // Here 100 is assigned to byte. We know that byte can hold 100.
//        int i4 = 500;
//        long l4 = i4; // int is smaller then long, so automatic converstion is hpeening
//
//        long l5 = 200;
//        int i5 = (int)l5;
//
//        double d6 = 50.0;
//        System.out.println(d6);
//
//
//        double d7 = 60.7;
//        int i7 = (int) d7; // there is data loss
//        System.out.println(d7);
//        System.out.println(i7);;
//
//        double d8 = 40;
//        byte b8 = (byte) d8;


    }
}
