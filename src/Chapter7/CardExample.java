package Chapter7;

public class CardExample {
    private final String face;
    private final String suit;

    public CardExample(String cardFace, String cardSuit) {
        this.face = cardFace;
        this.suit = cardSuit;
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }
}

