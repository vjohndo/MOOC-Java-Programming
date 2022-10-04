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

public class BoxWithMaxWeight extends Box {
    
    private ArrayList<Item> items;
    private int capacity;
    
    public BoxWithMaxWeight(int capacity) {
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }
    
    public int getWeight() {
        int weight = 0;
        for (Item item : this.items) {
            weight += item.getWeight();
        }
        return weight;
    }
    
    @Override
    public void add(Item item) {
        if (this.getWeight() + item.getWeight() > this.capacity) {
            return;
        }
        this.items.add(item);
    }
    
    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
    
    
}
