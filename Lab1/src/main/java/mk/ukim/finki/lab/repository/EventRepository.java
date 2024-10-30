package mk.ukim.finki.lab.repository;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.lab.bootstrap.DataHolder;
import mk.ukim.finki.lab.model.Event;
import mk.ukim.finki.lab.model.EventBooking;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EventRepository {
    public List<Event> findALl() {return DataHolder.events;}
    public List<Event> searchEvents(String text, int rating) {
       return DataHolder.events.stream()
               .filter(event -> (event.getName().contains(text) || event.getDescription().contains(text)) && event.getPopularityScore() >= rating)
               .toList();
   }
}
