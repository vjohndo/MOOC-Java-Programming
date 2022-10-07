/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author johndo
 */
public class Flight {
    public Airplane airplane;
    public Place departure;
    public Place arrival;
    
    public Flight(Airplane airplane, Place departure, Place arrival) {
        this.airplane = airplane;
        this.departure = departure;
        this.arrival = arrival;
    }
    
    public Airplane getAirplane() {
        return this.airplane;
    }
    
    public Place getDeparture() {
        return this.departure;
    }
    
    public Place getArrival() {
        return this.arrival;
    }
    
    @Override
    public String toString() {
        return new StringBuilder()
                .append(this.airplane)
                .append(" (")
                .append(this.departure)
                .append("-")
                .append(this.arrival)
                .append(")")
                .toString();
    }
}
