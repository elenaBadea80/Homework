package enumTraficLight;

public class Main {
    public static void main(String[] args) {

        TrafficLight light = TrafficLight.YELLOW;

        for (int i = 0; i < 6; i++) {
            System.out.println("Curent light " + light);
            light= light.next();
        }


//      for (TrafficLight light : TrafficLight.values()){
//          System.out.println(light.next());
//      }
    }
}
