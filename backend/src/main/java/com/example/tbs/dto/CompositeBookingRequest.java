package com.example.tbs.dto;

import lombok.Data;
import java.util.List;

@Data
public class CompositeBookingRequest {
    private List<BookingRequestDTO> bookings;

    // Getters and Setters
    public List<BookingRequestDTO> getBookings() {
        return bookings;
    }

    public void setBookings(List<BookingRequestDTO> bookings) {
        this.bookings = bookings;
    }
}
