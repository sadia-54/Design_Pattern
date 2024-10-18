package State_Pattern;

public class TrafficLight {
    private TrafficLightState currentState;

    //if the initial state is red
    public TrafficLight(){
        currentState = new RedLight();
    }

    public void setState(TrafficLightState state){
        currentState = state;
    }

    public void changeLight(){
        currentState.nextLight(this);
    }

    public void displayStatus(){
        currentState.displayStatus();
    }
    
}
