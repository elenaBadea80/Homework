package enumTraficLight;
// 8. Implement an enum TrafficLight with a method next() that transitions between RED, YELLOW, and GREEN.
public enum TrafficLight {

    GREEN("green"),
    RED("red"),
    YELLOW("yellow");

    private final String light;

    TrafficLight(String light) {
        this.light = light;
    }

    public String getLight() {
        return light;
    }

    public TrafficLight next(){
        return switch (this){
            case RED -> GREEN;
            case GREEN -> YELLOW;
            case YELLOW -> RED;
        };
    }


}
