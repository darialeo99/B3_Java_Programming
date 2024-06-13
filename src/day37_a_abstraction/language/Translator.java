package day37_a_abstraction.language;

public class Translator {

    public static void main(String[] args) {

        //Language obj = new Language(); // can not create obj of Interface


        Spanish s = new Spanish();
        s.hi();
        s.bye();
        System.out.println(s.PLANET);

        System.out.println("----------");

        Turkish t = new Turkish();
        t.hi();
        t.bye();
        System.out.println(t.PLANET);

        System.out.println("----------");
        // reach it by Interface
        System.out.println(Language.PLANET);

        // reach it by child class name
        System.out.println(Turkish.PLANET);
        System.out.println(Spanish.PLANET);







    }
}
