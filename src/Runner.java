public class Runner {
    public static void main(String[] args) {
        String[] playerNames = {"Alice", "Bob", "Charlie"};
        Game game = new Game(playerNames);
        game.play();
    }
}
