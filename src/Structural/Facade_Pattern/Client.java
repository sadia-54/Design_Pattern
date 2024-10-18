package Facade_Pattern;

public class Client {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        Light light = new Light();

        Movie movie = new Movie(amplifier, dvd, projector, light);

        movie.watchMovie();

        System.out.println(".........................................");

        movie.endMovie();
    }
    
}
