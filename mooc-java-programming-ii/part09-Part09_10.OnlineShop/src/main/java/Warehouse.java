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
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> stock;
    private Map<String, Integer> price;
    
    public Warehouse() {
        this.stock = new HashMap<>();
        this.price = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.stock.putIfAbsent(product, 0);
        this.stock.put(product, this.stock.get(product) + stock);
        
        this.price.put(product, price);
    }
    
    public int price(String product) {
        return this.price.getOrDefault(product, -99);
    }
    
    public int stock(String product) {
        return this.stock.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
        if (!this.stock.containsKey(product)) {
            return false;
        }

        if (this.stock.get(product) <= 0) {
            return false;
        }

        this.stock.put(product, this.stock.get(product) - 1);
        return true;
    }
    
    public Set<String> products() {
        return this.stock.keySet();
    }
}
