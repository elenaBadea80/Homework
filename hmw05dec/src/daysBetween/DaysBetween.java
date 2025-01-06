package daysBetween;
// 11. Write a program to calculate the number of days, months, and years between two dates entered by the user.

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DaysBetween {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.println("Enter the first date in format dd.MM.yyyy");
        String firstDateString = scanner.nextLine();
        LocalDate firstDate = LocalDate.parse(firstDateString, dtf);

        System.out.println("Enter the second date in format dd/MM/yyyy");
        String secondDateString = scanner.nextLine();
        LocalDate secondDate = LocalDate.parse(secondDateString, dtf);

        long daysBetween = ChronoUnit.DAYS.between(firstDate, secondDate);
        long monthBetween = ChronoUnit.MONTHS.between(firstDate, secondDate);
        long yearsBetween = ChronoUnit.YEARS.between(firstDate, secondDate);

        System.out.println(" ");
        Period period = Period.between(firstDate, secondDate);
        System.out.println("The diffrence between that two dates is: ");
        System.out.println(period.getYears()+ " years, " + period.getMonths() + " month and " + period.getDays() + " days.");
        System.out.println(" ");
        System.out.println("Difference between the two date:");
        System.out.println("Days: " + daysBetween);
        System.out.println("Months: " + monthBetween);
        System.out.println("Years; " + yearsBetween);
    }
}
