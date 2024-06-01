package day33_a_static;

public class Song {

    // INSTANCE VARIABLES

    String name;
    double length;
    String singer;
    String genre;


    //Creating constructors
    public Song (String name) {

        this.name = name; // s1.name = name;

    }

    public Song (String name, double length){

        //name = name;
        this(name); // calling first constructor
        this.length = length;
    }

    public Song (String name, double length, String singer, String genre){

//        name = name;
//        length = length;
        this(name, length); // calling second constructor
        this.singer = singer;
        this.genre = genre;

    }



    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", singer='" + singer + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
