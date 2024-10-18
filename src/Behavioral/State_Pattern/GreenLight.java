package State_Pattern;

public class GreenLight implements TrafficLightState{

    @Override
    public void nextLight(TrafficLight context) {
        context.setState(new YellowLight());
       
    }

    @Override
    public void displayStatus() {

        System.out.println("Green light---- Go!");
        
    }
    
}
