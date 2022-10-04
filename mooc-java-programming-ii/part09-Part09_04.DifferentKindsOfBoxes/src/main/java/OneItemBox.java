/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johndo
 */


public class OneItemBox extends Box {
    private Item item;
    
    // This is the default java implementation anyway
    public OneItemBox() {
        this.item = null;
    }
    
    public void add(Item item) {
        if (this.item == null) {
            this.item = item;
        }
    }
    
    @Override
    public boolean isInBox(Item item) {
        // return this.item != null && this.item.equals(item);
        if (this.item == null) {
            return false;
        }
        
        if (this.item.equals(item)) {
            return true;
        }
        
        return false;
    }
}
