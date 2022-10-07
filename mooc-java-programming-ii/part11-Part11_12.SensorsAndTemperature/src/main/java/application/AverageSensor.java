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
import java.util.List;
import java.util.ArrayList;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    public boolean isOn() {
        for (Sensor sensor : this.sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        
        return true;
    }
    
    public void setOn() {
        this.sensors.stream()
                .forEach(sensor -> sensor.setOn());
    }
    
    public void setOff() {
        this.sensors.stream()
                .forEach(sensor -> sensor.setOff());
    }
    
    public int read() {
        if (this.sensors.isEmpty()) {
            throw new IllegalStateException("No sensors added");
        }
        
        if (!this.isOn()) {
            throw new IllegalStateException("Sensor must be on!");
        }
        
        int sum = this.sensors.stream()
                .mapToInt(sensor -> sensor.read())
                .sum();
        
        int average = sum / this.sensors.size();
        
        this.readings.add(average);
        
        return average;
    }
    
    public List<Integer> readings() {
        return this.readings;
    }
    
    
    
}
