 
//Slip 4 (Q.2) Write a package for String operation which has two classes Con and 
  //        Comp. Con class concatenates two strings, and comp class compares  
    //      two strings. Also display proper message on execution. 

import StringOperation.*;

class Main {
    public static void main(String[] args) {

        Con1 c = new Con1();
        Comp p = new Comp();

        c.concatenate();
        p.compare();
    }
}

//javac -d . StringOperation\Con1.java StringOperation\Comp.java Main.java
