package day42_b_maps.classroom;


import java.util.HashMap;
import java.util.Map;

/*

    KEY - Value
    1 - Student
    2 - Student
    3 - Student
    ...

 */
public class ClassRoom {
    public static void main(String[] args) {

        Map<Integer, Student> map = new HashMap();

        Student s1 = new Student("Tom", 30.0, 10 );
        map.put(1, s1);

        map.put(2, new Student("Jack", 27.0, 7));
        map.put(3, new Student("Micky", 20.0, 8));
        map.put(4, new Student("Mouse", 18.0, 5));

        System.out.println(map);

        System.out.println();

        //Q: Get me the student which is assigned to the KEY 3
        System.out.println(map.get(3));

        //Q: get me the Student name which is assigned to the KEY 3
        System.out.println(map.get(4).name);

        //Q: How can I get all the Keys only
        // A: .keySet
        System.out.println(map.keySet());

        System.out.println();

        //Q: How can I get all the Values only
        //A: values();
        System.out.println(map.values());

        System.out.println();

        // another way to loop and get each

        for ( Integer each : map.keySet() ) {
            System.out.println("Row number: " + each);
            System.out.println(map.get(each));
            System.out.println();
        }

        System.out.println("------------");

        // another way to loop and get each value only

        for ( Student each : map.values()) {
            System.out.println(each);
        }

        System.out.println("----------");

        // Q: get me the students only whose age is less than 25

        for ( Student each : map.values()) {

            if (each.age < 25) {
                System.out.println(each);
            }

        }

        System.out.println("-------------");

        // another way to loop through using .entrySet() method
        for ( Map.Entry <Integer, Student> each : map.entrySet()) {
            System.out.println("Row number: " + each.getKey());
            System.out.println("Value: " + each.getValue());
        }



    }
}
