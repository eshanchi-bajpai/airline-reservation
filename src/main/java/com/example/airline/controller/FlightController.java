package com.example.airline.controller;

import com.example.airline.model.Flight;
import com.example.airline.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

    @GetMapping("/{id}")
    public Optional<Flight> getFlightById(@PathVariable Long id) {
        return flightService.getFlightById(id);
    }

    @PostMapping
    public Flight createFlight(@RequestBody Flight flight) {
        return flightService.saveFlight(flight);
    }

    @DeleteMapping("/{id}")
    public void deleteFlight(@PathVariable Long id) {
        flightService.deleteFlight(id);
    }
}
