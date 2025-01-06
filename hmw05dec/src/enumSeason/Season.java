package enumSeason;
// 7. Create an enum Season with constants SPRING, SUMMER, AUTUMN, and WINTER.
// Add a field for average temperature and a method to get a description for each season.
public enum Season {

    SPRING("spring",28),
    SUMMER("summer",37),
    AUTUMN("autumn",19),
    WINTER("winter",1);

    private final String name;
    private final double averageTemperature;


    Season(String name,double averageTempetaure){
        this.name = name;
        this.averageTemperature = averageTempetaure;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public String getName(){
        return name;
    }
    public String getDiscription(){
        return  switch (this){
            case SPRING -> name + " is a lovely season, with pleasant temperature and not very rainy.";
            case SUMMER -> getName() + " is a very hot season with burning sun and no rain.";
            case AUTUMN -> getName() + " is a nice season with a pleasant temperature, but a litlle rainy.";
            case WINTER -> getName() + " is a very cold season with snow.";
        };
    }
}
