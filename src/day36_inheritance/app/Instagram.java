package day36_inheritance.app;
/*
Create a class Instagram


Instagram class inherits App class


create constructor to call parent constructor and set up variables (name and version)


create method:
      postPicture()
          Example output: prints Posting picture to Instagram*/

public class Instagram extends App {

    //create constructor to call parent constructor and set up variables (name and version)
    public Instagram (double version) {
        // that app name will always be Instagram when we create Instagram objects that's why we hardcoding it
        super("Instagram", version);

    }

    // method

    public void postPicture () {
        System.out.println("Posting picture to " + name);
    }
}
