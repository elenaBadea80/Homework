package overlapEvents;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class OverlapEvent {

    static List<Event> findFreeSlots(List<Event> events, LocalDateTime startOfDay, LocalDateTime endOfDay) {
        List<Event> freeSlots = new ArrayList<>();
//        Collections.sort(events, (e1, e2) -> e1.start.compareTo(e2.start));
//sau:    events.sort((e1, e2) -> e1.start.compareTo(e2.start));

        LocalDateTime freeStart = startOfDay;

        for (Event event : events) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
            if (freeStart.isBefore(event.start)) {
                freeSlots.add(new Event(freeStart.format(formatter), event.start.format(formatter)));
            }
            freeStart = event.end;
        }
        if (freeStart.isBefore(endOfDay)) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
            freeSlots.add(new Event(freeStart.format(formatter), endOfDay.format(formatter)));
        }
        return freeSlots;
    }
}

// var 2
//        for (Event event : events) {
//            if (freeStart.isBefore(event.start)) {
//                freeSlots.add(new Event(freeStart.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm")), event.start.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm"))));
//            }
//            freeStart = event.end.isAfter(freeStart) ? event.end : freeStart;
//        }
//        if (freeStart.isBefore(endOfDay)) {
//            freeSlots.add(new Event(freeStart.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm")), endOfDay.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm"))));
//        }
//        return freeSlots;
//    }
//}