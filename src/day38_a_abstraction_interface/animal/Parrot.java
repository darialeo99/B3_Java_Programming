package day38_a_abstraction_interface.animal;

import day37_a_abstraction.language.Language;
import org.w3c.dom.ls.LSOutput;

public class Parrot extends Bird implements Flyable, Language {

    @Override
    public  void useWings() {
        System.out.println("Parrot is using wings to fly");
    }

    @Override
    public void eat() {
        System.out.println("Parrot is eating seeds");
    }

    // Coming from Flyable Interface

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    // coming from Language Interface (Different package)
    @Override
    public void hi() {
        System.out.println("Hi Hi");
    }

    @Override
    public void bye() {
        System.out.println("Bye Bye Bye");

    }
}
