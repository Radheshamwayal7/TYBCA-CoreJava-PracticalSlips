 
// Slip 7 (Q.1) Write a package game which will have 2 classes Indoor & Outdoor. Use 
     //     a function display () to generate the list of players for the specific game.  
   //       Use default & parameterized constructor. 

package Slip7;

import Slip7.game.*;

class Main {
    public static void main(String[] args) {

        Indoor i = new Indoor();
        Outdoor o = new Outdoor();

        Indoor i1 = new Indoor("King, Queen");
        Outdoor o1 = new Outdoor("Player1, Player2");

        i.display();
        o.display();

        i1.display();
        o1.display();
    }
}
