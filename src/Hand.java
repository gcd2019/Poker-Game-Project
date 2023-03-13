import java.util.ArrayList;

public class Hand {
    private final ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public Card get(int index) {
        return cards.get(index);
    }

    public int size() {
        return cards.size();
    }

    public void clear() {
        cards.clear();
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Card card : cards) {
            result.append(card.toString()).append("\n");
        }
        return result.toString();
    }
}
