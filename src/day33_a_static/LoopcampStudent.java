package day33_a_static;

import java.util.Arrays;

public class LoopcampStudent {

    String name;
    int groupNumber;

    static int batchNumber;
    static String[] teachers;
    static String schoolName;

    // STATIC BLOCK RUNS ONLY 1 TIME
    static {
        batchNumber = 3;
        teachers = new String[]{"Nadir", "Feuryz", "James", "Dinana"};
        schoolName = "Loopcamp";
        printInfo();

    }

    public static void printInfo() {
        System.out.println("School Info: ");
        System.out.println("\tSchool Name : " + schoolName);
        System.out.println("\tBatch number : " + batchNumber);
        System.out.println("\tTeachers : " + Arrays.toString(teachers));
        //System.out.println("Name: " + name);// can not use instance variable in static
    }

    // making constructor

    public LoopcampStudent (String name, int groupNumber) {
        this.name = name;
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return "Loopcamp Student Info " +
                "\n\tname= " + name +
                "\n\tgroupNumber=" + groupNumber;
    }
}