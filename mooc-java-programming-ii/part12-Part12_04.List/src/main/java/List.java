/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johndo
 */


public class List<Type> {

    private Type[] values;
    private int firstFreeIndex;

    public List() {
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    public void add(Type value) {
        if (firstFreeIndex >= this.values.length) {
            this.grow();
        }

        this.values[this.firstFreeIndex] = value;
        firstFreeIndex++;
    }
    
    private void grow() {
        int newSize = this.values.length + this.values.length / 2;
        Type[] newList = (Type[]) new Object[newSize];
        
        for (int i = 0; i < this.values.length; i++) {
            newList[i] = this.values[i];
        }
        
        this.values = newList;
    }

    public int indexOfValue(Type value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }

    public void remove(Type value) {
        int index = this.indexOfValue(value);
        if (index < 0) {
            return;
        }

        moveToLeft(index);
        firstFreeIndex--;
    }

    private void moveToLeft(int index) {

        while (index < this.firstFreeIndex) {
            this.values[index] = this.values[index + 1];
            index++;
        }
    }

    public boolean contains(Type value) {
        return this.indexOfValue(value) >= 0;
    }
    
    public Type value(int index) {
        if (index < 0 || index > this.firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
        }
        
        return this.values[index];
    }
    
    public int size() {
        return this.firstFreeIndex;
    }
    
}
