/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johndo
 */
public class Hideout<T> {
    
    private T t;
    
    public Hideout() {
        
    }
    
    public void putIntoHideout(T toHide) {
        this.t = toHide;
    }
    
    public T takeFromHideout() {
        T toReturn = t;
        this.t = null;
        return toReturn;
    }
    
    public boolean isInHideout() {
        if (t == null) {
            return false;
        }
        
        return true;
    }
    
}
