package day37_a_abstraction.hiding;

public class Person {
    String name = "Micky Mouse";

}

class SecretIdentity extends Person {

    String name = "Winnie Pooh";
    // we created another "name" variable in the sub class
    // but it was already being inherited from super class as well
    // so, now we are hiding the one from parent class
}

class Runner {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);



        SecretIdentity secretIdentity = new SecretIdentity();
        System.out.println(secretIdentity.name);
    }
}
