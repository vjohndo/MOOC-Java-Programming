/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

/**
 *
 * @author johndo
 */

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

public class FlightControl {
    public Map<String, Airplane> planes;
    public Map<String, Place> places;
    public Map<String, Flight> flights;
    
    public FlightControl() {
        this.planes = new HashMap<>();
        this.places = new HashMap<>();
        this.flights = new HashMap<>();
    }
    
    public void addAirplane(String id, int capacity) {
        Airplane plane = new Airplane(id, capacity);
        this.planes.put(id, plane);
    }
    
    public void addFlight(Airplane plane, String departureId, String arrivalId) {
        this.places.putIfAbsent(departureId, new Place(departureId));
        this.places.putIfAbsent(arrivalId, new Place(arrivalId));
        
        Flight flight = new Flight(plane, this.places.get(departureId), this.places.get(arrivalId));
        this.flights.put(flight.toString(), flight);
    }
    
    // Notice how we need to use collection to return values
    // this way we can .stream() the result 
    public Collection<Airplane> getAirplanes() {
        return this.planes.values();
    }
    
    public Collection<Flight> getFlights() {
        return this.flights.values();
    }
    
    public Airplane getAirplane(String id) {
        return this.planes.get(id);
    } 
    
}
