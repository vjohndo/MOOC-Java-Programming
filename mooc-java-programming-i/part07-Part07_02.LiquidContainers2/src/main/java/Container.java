/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johndo
 */
public class Container {
   private int volume;
   private int maxVolume;
   
   public Container() {
       this.volume = 0;
       this.maxVolume = 100;
   }
   
   public int contains() {
       return this.volume;
   }
   
   public void add(int amount) {
       if (amount < 0) {
           return;
       }
       
       this.volume += amount;
       
       if (this.volume > 100) {
           this.volume = 100;
       }
   }
   
   public void remove(int amount) {
       if (amount < 0) {
           return;
       }
       
       this.volume -= amount;
       
       if (this.volume < 0) {
           this.volume = 0;
       }
   }
   
   public void moveTo(Container other, int amount) {
       if (amount < 0) {
           return;
       }
       
       if (amount > this.volume) {
           amount = this.volume;
       }
       
       this.remove(amount);
       other.add(amount);
   }
   
   @Override
   public String toString() {
       return this.volume + "/" + this.maxVolume;
   }
}
