
// Q.2) Write a package game which will have 2 classes Indoor & Outdoor.
// Use a function display() to generate the list of players for the specific game.
// Use default & parameterized constructor.

import game25.*;

class Slip25Q2 {
    public static void main(String[] args) {

        Indoor25 i1 = new Indoor25();
        Outdoor25 o1 = new Outdoor25();

        Indoor25 i2 = new Indoor25("Carrom", 2);
        Outdoor25 o2 = new Outdoor25("Football", 11);

        System.out.println("Default Constructor:");
        i1.display();
        o1.display();

        System.out.println("\nParameterized Constructor:");
        i2.display();
        o2.display();
    }
}
