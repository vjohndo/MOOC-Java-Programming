/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johndo
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private List<Card> cards;
    
    public Hand() {
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.cards.add(card);
    }
    
    public void sort() {
        Collections.sort(cards);
    }
    
    public void print() {
        this.cards.stream()
                .forEach(card -> System.out.println(card));
    }
    
    public int sum() {
        return this.cards.stream()
                .mapToInt(card -> card.getValue())
                .sum();
    }
    
    public void sortBySuit() {
        BySuitInValueOrder sortBySuit = new BySuitInValueOrder();
        Collections.sort(this.cards, sortBySuit);
    }
    
    @Override
    public int compareTo(Hand another) {
        return this.sum() - another.sum();
    }
    
    
}
