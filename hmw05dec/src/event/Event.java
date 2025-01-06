package event;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// 12. Create a class Event with a field eventTime (using LocalDateTime).
// Add a method to calculate how much time remains until the event.
public class Event {

    private LocalDateTime eventTime;

    public Event(String eventTimeString) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        this.eventTime = LocalDateTime.parse(eventTimeString, dtf);
    }

    public Duration timeToEvent() {
        LocalDateTime now = LocalDateTime.now();
        return Duration.between(now,eventTime);
    }

    public void printTimeToEvent(){
        Duration duration = timeToEvent();
        long days = duration.toDays();
        long hours = duration.toHours() % 24;
        long minutes = duration.toMinutes() % 60;
        long seconds = duration.toSeconds() % 60;

        System.out.println("Time to event: ");
        System.out.println("Days: " + days);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}
