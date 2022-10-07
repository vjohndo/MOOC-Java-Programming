/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author johndo
 */
import java.util.Random;


public class TemperatureSensor implements Sensor {
    
    private boolean powered;
    
    public TemperatureSensor() {
        this.powered = false;
    }
    
    public boolean isOn() {
        return this.powered;
    }
    
    public void setOn() {
        this.powered = true;
    }
    
    public void setOff() {
        this.powered = false;
    }
    
    
    public int read() {
        if (!this.isOn()) {
            throw new IllegalStateException("Sensor must be on before being read");
        }
        return new Random().nextInt(61) - 30;
    }
}
