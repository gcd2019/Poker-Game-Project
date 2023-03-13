public class Player {
    private final String name;
    private final Hand hand;

    public Player(String name) {
        this.name = name;
        hand = new Hand();
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public String toString() {
        return name + ":\n" + hand;
    }
}
