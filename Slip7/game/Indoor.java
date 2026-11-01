package Slip7.game;

public class Indoor {
    String players;

    public Indoor() {
        players = "Rahul, Amit, Sam";
    }

    public Indoor(String p) {
        players = p;
    }

    public void display() {
        System.out.println("Indoor Players: " + players);
    }
}