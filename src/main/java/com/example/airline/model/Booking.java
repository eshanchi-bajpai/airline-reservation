package com.example.airline.model;

import jakarta.persistence.*;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Link to User
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Link to Flight
    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;

    private String bookingDate;

    public Booking() {}

    public Booking(User user, Flight flight, String bookingDate) {
        this.user = user;
        this.flight = flight;
        this.bookingDate = bookingDate;
    }

    // getters & setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Flight getFlight() { return flight; }
    public void setFlight(Flight flight) { this.flight = flight; }

    public String getBookingDate() { return bookingDate; }
    public void setBookingDate(String bookingDate) { this.bookingDate = bookingDate; }
}
