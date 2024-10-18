package Facade_Pattern;

public class Movie {
    private Amplifier amplifier;
    private DVDPlayer dvd;
    private Projector projector;
    private Light light;

    public Movie(Amplifier amplifier, DVDPlayer dvd, Projector projector, Light light){
        this.amplifier = amplifier;
        this.dvd = dvd;
        this.projector = projector;
        this.light = light;
    }

    public void watchMovie(){
        System.out.println("It's movie time!!!...");
        amplifier.on();
        dvd.play();
        projector.on();
        light.off();
    }

    public void endMovie(){
        System.out.println("Movie ends, go and sleep!!!....");
        amplifier.off();
        dvd.off();
        projector.off();
        light.on();
    }
    
}
