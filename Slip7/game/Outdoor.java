package Slip7.game;

public class Outdoor {
    String players;

    public Outdoor() {
        players = "Virat, Rohit, Dhoni";
    }

    public Outdoor(String p) {
        players = p;
    }

    public void display() {
        System.out.println("Outdoor Players: " + players);
    }
}