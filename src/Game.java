package src;

public class Game {
    public static int judge(Player p1, Player p2) {
        return p1.getHand().compare(p2.getHand());
    }
}
