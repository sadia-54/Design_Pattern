package State_Pattern;

public class Client {
    public static void main(String[] args) {

        TrafficLight trafficLight = new TrafficLight();

        for(int i=0; i<5; i++){
            trafficLight.displayStatus();
            trafficLight.changeLight();
        }
        
    }
    
}
