package enumDay;

// 6. Create an enum Day with values for the days of the week and a method to determine if a day is a weekday or weekend.
public enum Day {

    SUNDAY("sunday"),
    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday");

    private final String nameDay;

    Day(String nameDay) {
        this.nameDay = nameDay;
    }

    public String getNameDay() {
        return nameDay;
    }

    public static Day getEnumByName(String name) {
        for (Day day : values()) {
            if (day.nameDay.endsWith(name)) {
                return day;
            }
        }
        return null;
    }

    public boolean isWeekendDay(){
        return this == SATURDAY || this == SUNDAY;
    }

}
