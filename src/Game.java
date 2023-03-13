import java.util.Scanner;

public class Game {
    private final Deck deck;
    private final Player[] players;
    private final int numPlayers;
    private int currentPlayerIndex;

    public Game(String[] playerNames) {
        numPlayers = playerNames.length;
        players = new Player[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            players[i] = new Player(playerNames[i]);
        }
        deck = new Deck();
        currentPlayerIndex = 1;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the poker game!");
        while (true) {
            deck.shuffle();
            dealCards();
            printHands();
            System.out.println(players[currentPlayerIndex].getName() + ", it's your turn.");
            System.out.println("Enter 'c' to continue or 'q' to quit.");
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            currentPlayerIndex = getNextPlayerIndex();
        }
        scanner.close();
        System.out.println("Thanks for playing!");
    }

    private void dealCards() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < numPlayers; j++) {
                players[j].getHand().add(deck.draw());
            }
        }
    }

    private void printHands() {
        for (int i = 0; i < numPlayers; i++) {
            System.out.println(players[i].toString());
        }
    }

    private int getNextPlayerIndex() {
        int nextPlayerIndex = currentPlayerIndex + 1;
        if (nextPlayerIndex == numPlayers) {
            nextPlayerIndex = 0;
        }
        return nextPlayerIndex;
    }
}
