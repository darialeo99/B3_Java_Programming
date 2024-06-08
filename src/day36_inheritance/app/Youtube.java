package day36_inheritance.app;
/*
Create a class Youtube

    - Youtube class inherits App class

    - create constructor to call parent constructor and set up variables (name and version)

    - create method:
        watchVideo()
            Example output: prints Watching java tutorial
 */

public class Youtube extends App {

    //- create constructor to call parent constructor and set up variables (name and version)

    public Youtube (double version) {
        super ("Youtube", version);

    }

    // method

    public void WatchVideo () {
        System.out.println("watching java tutorial on " + name);

    }


}
