package day36_inheritance.app;
/*
Create an App class


create variables:
      name (app name), version


create constructor to initialize the variables


create method:
      download()
          Example output: prints $name is downloading version $version

 */

public class App {

    // instance variables
    String name;
    double version;

    // constructor
    public App (String name, double version) {
        this.name = name; // this. - is the reference of instance of App Class
        this.version = version;

    }

    // instance method

    public void download () {
        System.out.println(name + " is downloading version " + version);
    }
}
