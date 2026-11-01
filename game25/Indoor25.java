
// Slip 25 Q2 - Indoor Game

package game25;

public class Indoor25 {
    String gameName;
    int players;

    public Indoor25() {
        gameName = "Chess";
        players = 2;
    }

    public Indoor25(String gameName, int players) {
        this.gameName = gameName;
        this.players = players;
    }

    public void display() {
        System.out.println("Indoor Game: " + gameName);
        System.out.println("Players: " + players);
    }
}
