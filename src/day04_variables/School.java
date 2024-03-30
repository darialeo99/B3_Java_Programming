package day04_variables;

public class School {
    public static void main(String[] args) {
        int numOfStudentsInGradeOne = 40;
        int numOfStudentsInGradeTwo = 25;
        int numOfStudentsInGradeThree = 34;
        int numOfStudentsInGradeFour = 19;
        int numOfStudentsInGradeFive  = 28;

        int totalNumberOfStudents = numOfStudentsInGradeOne + numOfStudentsInGradeTwo + numOfStudentsInGradeThree + numOfStudentsInGradeFour + numOfStudentsInGradeFive; // 136

        double numberOfSchoolDays = 100.5;
        double numberOfSnowDays = 5.5;
        double averageGpaInSchool = 3.5;


        System.out.println("Number of students in Grade 1:" + numOfStudentsInGradeOne);
        System.out.println("Number of students in Grade 2:" + numOfStudentsInGradeTwo);
        System.out.println("Number of students in Grade 3:" + numOfStudentsInGradeThree);
        System.out.println("Number of students in Grade 4:" + numOfStudentsInGradeFour);
        System.out.println("Number of students in Grade 5:" + numOfStudentsInGradeFive);

        System.out.println();

        System.out.println("Total number of students: " + totalNumberOfStudents);

        System.out.println("Number of School days: \t" + numberOfSchoolDays);
        System.out.println("Number of Snow days: \t\t" + numberOfSnowDays);
        System.out.println("Average Gpa in school: \t\t\t" + averageGpaInSchool);

        int num1 = 5;
        int num2 =num1;
        System.out.println(num1); // 5
        System.out.println(num2);; // 5

    }
}
