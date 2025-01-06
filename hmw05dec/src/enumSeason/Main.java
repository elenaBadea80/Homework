package enumSeason;

public class Main {
    public static void main(String[] args) {

        for(Season mySeason : Season.values()){
            System.out.println(mySeason.getDiscription() + " (average temperature: " + mySeason.getAverageTemperature() + " C)");
        }
    }
}
