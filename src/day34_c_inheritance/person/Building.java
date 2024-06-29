package day34_c_inheritance.person;

public class Building {
    public static void main(String[] args) {

        Person p = new Person();
        p.name = "general name";
        p.age = 0;
        p.talk();
        //p.study(); // parent class can not reach anything from child class
        // s1.isHappy = true; belongs to child not parent


        Student s1 = new Student();
        s1.name = "Winnie"; // Child class can access to parent class members
        s1.age = 18; // Child class can access to parent class members
        s1.talk(); // Child class can access to parent class members
        s1.study(); // Child class can access to its own members
        s1.isHappy = true;

        ForeignStudent f1 = new ForeignStudent();
        f1.name = "Tom";
        f1.age = 20;
        f1.campusAccessNumberIsPaid = "Yes, you need to pay for access";


    }
}
