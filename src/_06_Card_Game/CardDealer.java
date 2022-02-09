package _06_Card_Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class CardDealer {
    int people = 2;
    ArrayList<Card> person1Deck;
    ArrayList<Card> person2Deck;
    ArrayList<Card> deck;
    public CardDealer() {
    	this.deck = new ArrayList<Card>();
    	
    }
    public void makeDeck() {
    	Rank r[] = Rank.values();
    	Suit s[] = Suit.values();
    		for (int i = 0; i < s.length; i++) {
    			for (int j = 0; j < r.length; j++) {
    				deck.add(new Card(r[j],s[i]));
				}
			}
    }
    public void shuffle() {
    	Collections.shuffle(deck);	
    }
    public ArrayList<Card> getPerson1Deck(){
    	return person1Deck;
    }
    public ArrayList<Card> getPerson2Deck(){
    	return person2Deck;
    }
    public void deal() {
    	for (int i = 0; i < deck.size(); i++) {
			if (i % 2 == 0) {
				person1Deck.add(deck.get(i));
			}else {
				person2Deck.add(deck.get(i));
			}
		}
    }
    

}
