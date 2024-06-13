package day37_a_abstraction.Gym;

public class Gym {
    public static void main(String[] args) {

        //Exercise obj1 = new Exercise("Running");

        Running obj1 = new Running("Marathon");
        obj1.performExercise();
        System.out.println(obj1.burnCalories(10));


        PullsUps obj2 = new PullsUps("Crosfit");
        obj2.performExercise();
        System.out.println(obj2.burnCalories(10));

    }
}
