package State_Pattern;

public class YellowLight implements TrafficLightState{

    @Override
    public void nextLight(TrafficLight context) {
        context.setState(new RedLight());
       
    }

    @Override
    public void displayStatus() {

        System.out.println("Yellow light---- Caution!");
      
    }
    
}
