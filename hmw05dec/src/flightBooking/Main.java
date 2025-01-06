package flightBooking;

public class Main {
    public static void main(String[] args) {

        FlightBooking flight = new FlightBooking("Flight123", "12/12/2024 14:30", "12/12/2024 17:45", "Europe/Bucharest");

        flight.displayFlightDuration();
    }
}
