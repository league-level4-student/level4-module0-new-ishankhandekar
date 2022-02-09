package _06_Card_Game;

import java.util.ArrayList;

public class Game {
static CardDealer dealer = new CardDealer();
static ArrayList<Card> person1Deck;
static ArrayList<Card> person2Deck;
	public static void main(String[] args) {
		dealer.makeDeck();
		dealer.shuffle();
		dealer.deal();
		person1Deck = dealer.getPerson1Deck();
		person2Deck = dealer.getPerson2Deck();
		while (person1Deck.size() != 0 || person2Deck.size() != 0) {
			if (person1Deck.get(0).getRank().value > person2Deck.get(0).getRank().value) {
				person1Deck.add(person1Deck.remove(0));
				person1Deck.add(person2Deck.remove(0));
			}else if (person1Deck.get(0).getRank().value < person2Deck.get(0).getRank().value) {
				person2Deck.add(person2Deck.remove(0));
				person2Deck.add(person1Deck.remove(0));
			} else {
				
			}
		}
	}
}
