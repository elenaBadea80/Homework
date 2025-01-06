package currentDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

// 10. Create a program that displays the current date and time in various formats (e.g., dd-MM-yyyy, MM/dd/yyyy, HH:mm:ss)
public class currentDate {
    public static void main(String[] args) {

        LocalDate currentDate1 = LocalDate.now();
        LocalDateTime currentDate = LocalDateTime.now();

        System.out.println(currentDate1 + " / " + currentDate);
        System.out.println(" ");
        LocalDateTime currentDate2 = LocalDateTime.now();

        DateTimeFormatter dtfCurrentDate1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter dtfCurrentDate2 = DateTimeFormatter.ofPattern("MM/dd/yy'T'HH:mm:ss");
        //String format = curentDate2.format(dtfCurentDate2);

        System.out.println(currentDate2.format(dtfCurrentDate1));
        System.out.println(currentDate2.format(dtfCurrentDate2));
        //System.out.println(format);
        System.out.println(" ");
        LocalDateTime currentdate3 = LocalDateTime.now();
        DateTimeFormatter dtfCurrentDate3 = DateTimeFormatter.ofPattern("MM/yyyy");
        DateTimeFormatter dtfCurentdate4 = DateTimeFormatter.ofPattern("dd/MM/yy");
        DateTimeFormatter dtfCurrentDate5 = DateTimeFormatter.ofPattern("MM/dd/yy");
        DateTimeFormatter dtfCurrentDate6 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println(currentdate3.format(dtfCurrentDate3));
        System.out.println(currentdate3.format(dtfCurrentDate5));
        System.out.println(currentdate3.format(dtfCurentdate4));
        System.out.println(currentdate3.format(dtfCurrentDate6));

        System.out.println(" ");
        java.util.Date date = new java.util.Date();
        System.out.println(date);

        System.out.println(" ");

        ZonedDateTime zdt = ZonedDateTime.now();
        ZoneId zdt1 = zdt.getZone();
        System.out.println(zdt);
        System.out.println(zdt1);
    }


}
