package mk.ukim.finki.lab.repository;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.lab.model.Event;
import mk.ukim.finki.lab.model.EventBooking;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EventRepository {
    public List<Event> events = null;
    public List<EventBooking> eventBookings = null;

   public EventRepository() {
       events = new ArrayList<>();
       eventBookings = new ArrayList<>();

       for(int i=1; i<=10; i++) {
           events.add(new Event("event"+i, "description"+i, i));
       }
   }

   public List<Event> findALl() {
       return this.events;
   }
   public List<Event> searchEvents(String text, int rating) {
       return this.events.stream()
               .filter(event -> (event.getName().contains(text) || event.getDescription().contains(text)) && event.getPopularityScore() >= rating)
               .toList();
   }
}
