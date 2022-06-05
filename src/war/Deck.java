package war;

import java.util.*;

public class Deck {
    List<Card> cards = new ArrayList<Card>();
    
    public Deck() {
        for(int suit = 0; suit < 4; suit++) {
            for(int rank = 2; rank < 15; rank++) {
                cards.add(new Card(suit, rank));
            }
        }
    }
    
    public void shuffle() {
        Collections.shuffle(cards);
    }
    
    public Card draw() {
        return cards.remove(0);
    }
}
