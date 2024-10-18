package State_Pattern;

public class RedLight implements TrafficLightState{

    @Override
    public void nextLight(TrafficLight context) {
        context.setState(new GreenLight());
       
    }

    @Override
    public void displayStatus() {

        System.out.println("Red light---- Stop!!!");
        
    }
    
}
