package State_Pattern;

public interface TrafficLightState {

    public void nextLight(TrafficLight context);

    public void displayStatus();

    
} 