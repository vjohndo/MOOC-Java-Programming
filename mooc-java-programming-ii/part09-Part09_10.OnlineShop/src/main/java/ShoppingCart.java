/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johndo
 */
import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
    private Map<String, Item> items;
    
    public ShoppingCart() {
        this.items = new HashMap<>();
    }
    
    public void add(String product, int price) {
        this.items.putIfAbsent(product, new Item(product,0,price));
        this.items.get(product).increaseQuantity();
    }
    
    public int price() {
        int price = 0;
        for (Item item : this.items.values()) {
            price += item.price();
        }
        return price;
    }
    
    public void print() {
        for (Item item : this.items.values()) {
            System.out.println(item);
        }
    }
}
