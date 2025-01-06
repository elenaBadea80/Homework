package overlapEvents;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event {

    LocalDateTime start;
    LocalDateTime end;

    Event(String start, String end){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        this.start=LocalDateTime.parse(start, formatter);
        this.end = LocalDateTime.parse(end, formatter);
    }

    boolean overlapEvents(Event other){
        boolean startsBeforeOtherEnds = this.start.isBefore(other.end) || this.start.isEqual(other.end);
        boolean endsAfterOtherStarts = this.end.isAfter(other.start) || this.end.isEqual(other.start);
        return startsBeforeOtherEnds && endsAfterOtherStarts;
    }
}
