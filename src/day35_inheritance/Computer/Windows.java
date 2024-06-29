package day35_inheritance.Computer;

public class Windows extends Computer {

    String edgeVersion;


   public Windows (String os, int memory) {
    // super (); - default
      // super.os = os;
       //this.memory = memory;

       super(os, memory);


//       super.test(); // calls from Parent "Computer"
//       this.test();// Calling method from child "Windows"


   }

   public Windows (String os, int memory, String edgeVersion) {

       //super(os, memory);
       this(os, memory);
       this.edgeVersion = edgeVersion;

   }
}
