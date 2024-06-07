package day35_inheritance.Computer;

public class Mac extends Computer {

    String SafariVersion;

    public Mac (String os, int memory) {

        // super (); - default
        super (os, memory);
        //super.os = os;
        //super.memory = memory;


    }

    public Mac (String os, int memory, String safariVersion) {

        super (os, memory);
        this.SafariVersion = safariVersion;


    }
}
