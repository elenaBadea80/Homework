package enumDay;

public class Main {
    public static void main(String[] args) {

        for (Day weekDay : Day.values()){
            if (weekDay.isWeekendDay()){
                System.out.println(weekDay.getNameDay() + " is a weekend.");
            } else {
                System.out.println(weekDay.getNameDay() + " is a weekday.");
            }
        }
    }
}
