package war;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deck deck = new Deck();
        System.out.print("Enter Player 1 name: ");
        Player player1 = new Player(sc.nextLine());
        System.out.print("Enter Player 2 name: ");
        Player player2 = new Player(sc.nextLine());
        
        System.out.println("");
        
        deck.shuffle();
        
        for(int i = 1; i <= 52; i++) {
            if(i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }
        
        for(int i = 1; i < 27; i++) {
            Card player1Card = player1.flip();
            Card player2Card = player2.flip();
            System.out.println("Round " + i);
            System.out.println(player1.name + ": " + player1Card.describe());
            System.out.println(player2.name + ": " + player2Card.describe());
            if(player1Card.value > player2Card.value) {
                player1.incrementScore();
                System.out.println(player1.name + " wins this round");
            } else if (player1Card.value < player2Card.value) {
                player2.incrementScore();
                System.out.println(player2.name + " wins this round");
            } else {
                System.out.println("This round is a draw");
            }
            System.out.println("");
        }
        
        System.out.println("Final Score");
        System.out.println(player1.name + ": " + player1.score);
        System.out.println(player2.name + ": " + player2.score);
        if(player1.score > player2.score) {
            System.out.println(player1.name + " wins!");
        } else if(player1.score < player2.score) {
            System.out.println(player2.name + " wins!");
        } else {
            System.out.println("Draw!");
        }
        
        sc.close();
    }

}
