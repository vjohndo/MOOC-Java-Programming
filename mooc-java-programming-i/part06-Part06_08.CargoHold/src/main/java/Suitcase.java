/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johndo
 */

import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int weightLimit;
    
    public Suitcase(int weightLimit) {
        this.items = new ArrayList<>();
        this.weightLimit = weightLimit;
    }
    
    public int totalWeight() {
        int currentWeight = 0;
        for (Item item: items) {
            currentWeight += item.getWeight();
        }
        return currentWeight;
    }
    
    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() > this.weightLimit) {
            return;
        }
        
        this.items.add(item);
    }
    
    public void printItems() {
        for (Item item: items) {
            System.out.println(item);
        }
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item toReturn = this.items.get(0);
        
        for (Item item: items) {
            if (item.getWeight() > toReturn.getWeight()) {
                toReturn = item;
            }
        }
        
        return toReturn;
    }
    
    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        if (items.size() == 1) {
            return items.size() + " item (" + this.totalWeight() + " kg)";
        }
        
        return items.size() + " items (" + this.totalWeight() + " kg)";
    }
    
}
