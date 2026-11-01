
// Slip 25 Q2 - Outdoor Game

package game25;

public class Outdoor25 {
    String gameName;
    int players;

    public Outdoor25() {
        gameName = "Cricket";
        players = 11;
    }

    public Outdoor25(String gameName, int players) {
        this.gameName = gameName;
        this.players = players;
    }

    public void display() {
        System.out.println("Outdoor Game: " + gameName);
        System.out.println("Players: " + players);
    }
}
