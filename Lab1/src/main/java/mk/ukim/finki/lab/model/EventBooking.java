package mk.ukim.finki.lab.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EventBooking {
    String eventName;
    String attendeeName;
    String attendeeAddress;
    int numberOfTickets;
}
