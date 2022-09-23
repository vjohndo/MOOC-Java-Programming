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

public class Package {
    private ArrayList<Gift> contents;
    
    public Package() {
        this.contents = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        this.contents.add(gift);
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Gift gift: contents) {
            totalWeight += gift.getWeight();
        }
        return totalWeight;
    }
}
