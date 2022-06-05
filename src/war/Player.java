package war;

import java.util.*;

public class Player {
    List<Card> hand = new ArrayList<Card>();
    int score;
    String name;
    
    public Player(String name) {
        this.name = name;
        score = 0;
    }
    
    public void describe() {
        System.out.println("Player name: " + name);
        System.out.println("Player score: " + score);
        System.out.println("Cards Remaining: " + hand.size());
        for(Card card : hand) {
            System.out.println(card.describe());
        }
    }
    
    public Card flip() {
        return hand.remove(0);
    }
    
    public void draw(Deck deck) {
        hand.add(deck.draw());
    }
    
    public void incrementScore() {
        score += 1;
    }

}
