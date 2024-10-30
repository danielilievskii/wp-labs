package mk.ukim.finki.lab.service;

import mk.ukim.finki.lab.model.EventBooking;

public interface EventBookingService {
    EventBooking placeBooking(String eventName, String attendeeName, String attendeeAddress, int numberOfTickets);
}
