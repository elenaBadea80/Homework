package overlapEvents;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static hmw05dec.overlapEvents.OverlapEvent.findFreeSlots;

public class Main {

    public static void main(String[] args) {
        List<Event> events = new ArrayList<>();
        events.add(new Event("11.12.2024 09:00", "11.12.2024 10:00"));
        events.add(new Event("11.12.2024 12:00", "11.12.2024 13:00"));
        events.add(new Event("11.12.2024 16:00", "11.12.2024 17:00"));
        LocalDateTime startOfDay = LocalDateTime.parse("11.12.2024 00:00", DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm"));
        LocalDateTime endOfDay = LocalDateTime.parse("11.12.2024 23:59", DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm"));
        List<Event> freeSlots = findFreeSlots(events, startOfDay, endOfDay);
        System.out.println("Free slots in the day:");
        for (Event slot : freeSlots) {
            System.out.println(slot.start.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm")) + " to " + slot.end.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm")));
        }
    }
}
