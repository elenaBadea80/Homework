package dateWeekDay;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// 15. Write a program to determine the day of the week for any given date.
public class DateWeekDay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.println("Enter the date in format dd.MM.yyyy");
        String myDate = scanner.nextLine();

        LocalDate date = LocalDate.parse(myDate, formatter);

        String weekDay = date.getDayOfWeek().name();

        System.out.println("The of the week for this date is: " + weekDay);
    }
}
