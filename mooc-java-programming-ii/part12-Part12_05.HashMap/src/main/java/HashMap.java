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

public class HashMap<K, V> {
    private ArrayList<Pair<K, V>>[] values;
    private int firstFreeIndex;
    
    public HashMap() {
        this.values = new ArrayList[32];
        this.firstFreeIndex = 0;
    }
    
    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            return null;
        }
        
        ArrayList<Pair<K, V>> valuesAtIndex = this.values[hashValue];
        
        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.get(i).getKey().equals(key)) {
                // this returns the key-value pair, we want the value;
                return valuesAtIndex.get(i).getValue();
            }
        }
        
        return null;
    }
    
    public void add(K key, V value) {
        ArrayList<Pair<K, V>> valuesAtIndex = this.getListBasedOnKey(key);
        
        int indexOfKey = this.getIndexOfKey(valuesAtIndex, key);
        
        if (indexOfKey < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        } else {
            valuesAtIndex.get(indexOfKey).setValue(value);
        }
        
        if (1.0 * this.firstFreeIndex / this.values.length > 0.75) {
            grow();
        }

    }
    
    private void grow() {
        ArrayList<Pair<K, V>>[] newArray = new ArrayList[this.values.length * 2];
        
        
        for (int i = 0; i < this.values.length; i++) {
            copy(newArray, i);
        }
        
        this.values = newArray;
    }
    
    private void copy(ArrayList<Pair<K, V>>[] newArray, int fromIndex) {
        
        // SKip this round if the index is currently pointing to null
        if (this.values[fromIndex] == null) {
            return;
        }
        
        for (Pair pair : this.values[fromIndex]) {
            int newHashValue = Math.abs(pair.getKey().hashCode() % newArray.length);
            
            if (newArray[newHashValue] == null) {
                newArray[newHashValue] = new ArrayList<>();
            }
            
            newArray[newHashValue].add(pair);
        }
    }
    
    private int getIndexOfKey(ArrayList<Pair<K, V>> valuesAtIndex, K key) {
        
        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.get(i).getKey().equals(key)) {
                return i;
            }
        }
        return -1;
    }
    
    private ArrayList<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            this.values[hashValue] = new ArrayList<>();
        }
        
        return this.values[hashValue];
    }
    
    public V remove(K key) {
        ArrayList<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        
        if (valuesAtIndex.isEmpty()) {
            return null;
        }
        
        int index = getIndexOfKey(valuesAtIndex, key);
        
        if (index < 0) {
            return null;
        }
        
        return valuesAtIndex.remove(index).getValue(); 
    }
}
