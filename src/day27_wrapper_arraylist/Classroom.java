package day27_wrapper_arraylist;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {

        ArrayList <String> groupTwo = new ArrayList<>();
        groupTwo.add("Laura");
        groupTwo.add("Jeyhun");
        groupTwo.add("Andrew");
        groupTwo.add("Alex");
        groupTwo.add("Ayaz");

        ArrayList <String> groupThree = new ArrayList<>();
        groupThree.add("Kanan");
        groupThree.add("Gedi");
        groupThree.add("Anna");

        System.out.println();

        System.out.println("First student from group 2: " + groupTwo.get(0));
        System.out.println("First student from group 3: " + groupThree.get(0));

        System.out.println();

        System.out.println("Last student from group 2: " + groupTwo.get(groupTwo.size()-1));
        //System.out.println("Last student from group 3: " + groupThree.get(groupTwo.size()-1));

        System.out.println();

        for (int i = 0; i < groupTwo.size(); i++) {
            System.out.println("Group two students: " + (i + 1) +  " " + groupTwo.get(i));

        }

        System.out.println();

        int counter = 1;
        for (String eachStudent : groupThree){

            System.out.println("Group three students: " + counter++ +  " " + eachStudent);
            //System.out.println("Student: " + eachStudent);

        }

    }
}
