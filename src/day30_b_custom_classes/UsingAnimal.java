package day30_b_custom_classes;

public class UsingAnimal {
    public static void main(String[] args) {

        Animal animal1 = new Animal(); // new object
        System.out.println(new Animal().population); // new object
        animal1.population = 10000000;
        animal1.species = "Bird";

        System.out.println(animal1.population);
        System.out.println(animal1.species);

        System.out.println(new Animal().species); // new object

        new Animal ().population = 1000; // created a new object and assigned 1000 to population. But we can not print it since it does not hav reference name

        System.out.println(new Animal().population); // new object

        System.out.println("----------------------");

        // To be able ro print object, I have to have toString method declared in Class
        System.out.println(animal1);

        // To be able ro print object, I have to have toString method declared in Class
        System.out.println(new Animal());




    }
}
