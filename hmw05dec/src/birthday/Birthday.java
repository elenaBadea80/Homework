package birthday;
// 13. Develop a program to calculate a person’s exact age in years, months, and days using their birthdate.

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyy");

        System.out.println("Enter your birthdate in format dd.MM.yyyy");
        String birthDateString = scanner.nextLine();
        LocalDate birthdate = LocalDate.parse(birthDateString, formatter);

        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthdate, currentDate);

        System.out.println("You are " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days old.");
    }
}
