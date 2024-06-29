package day33_a_static;

import java.util.Arrays;

public class School {
    public static void main(String[] args) {

        LoopcampStudent student1 = new LoopcampStudent("Elina", 3);
        System.out.println(student1);

        LoopcampStudent student2 = new LoopcampStudent("Aygun", 3);
        System.out.println(student2);

        System.out.println();
        LoopcampStudent.printInfo();

        // can you get me the names of the teachers
        System.out.println();
        System.out.println("Teacher at Loopcamp: " + Arrays.toString(LoopcampStudent.teachers));

        System.out.println();
        for (String eachTeacher : LoopcampStudent.teachers) {
            System.out.println(eachTeacher);

        }

        System.out.println();
       int i = 0;
       for (String eachTeacher :LoopcampStudent.teachers ) {
           System.out.println("Teacher " + ++i + ": " + eachTeacher);
       }
    }
}
