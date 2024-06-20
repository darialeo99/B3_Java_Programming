package day40_exception.person;

import java.rmi.activation.ActivationGroup_Stub;

public class Person {

    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception { // compile time exception

        // Compile time exception can be handled with 1) try and catch OR  2) with method signature

        if (name == null || name.isEmpty()) {
           // System.out.println("Cannot assign");

            throw new Exception("Name can not be empty"); // compile time exception

        }else {

            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) { // runtime exception

            throw new IllegalArgumentException("Age must be between 0 and 120");
        }

        this.age = age;
    }
}

