package flightBooking;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

// 14. Simulate a flight booking system where flights have departure and arrival times (ZonedDateTime).
// Calculate and display the flight duration.
public class FlightBooking {

    private String flightNumber;
    private ZonedDateTime departureTime;
    private ZonedDateTime arrivalTime;

    public FlightBooking( String flightNumber, String departureTimeString, String arrivalTimeString, String zoneId){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm z");
        this.arrivalTime = ZonedDateTime.parse(arrivalTimeString + " " + zoneId, formatter);
        this.departureTime = ZonedDateTime.parse(departureTimeString + " " + zoneId, formatter);
        this.flightNumber=flightNumber;
    }

    public Duration durationFlight(){
        return Duration.between(departureTime, arrivalTime);
    }

    public void displayFlightDuration(){
        Duration duration = durationFlight();
        long hours = duration.toHours() %24;
        long minutes =duration.toMinutes() %60;

        System.out.println("Flight " + flightNumber + " duration: "+ hours + "h" + minutes + "'");
    }
}
