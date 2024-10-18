package Factory_Pattern;

public class Client {

    public static void main(String[] args) {
        int level = (int)(Math.random()*2)+1;

        AsteroidsFactory asteroidsFactory;

        if(level==1){
            asteroidsFactory = new Level1AsteroidsFactory();
        }
        else{
            asteroidsFactory = new Level2AsteroidsFactory();
        }

        int score = (int)(Math.random()*1100);

        Asteroids asteroids = asteroidsFactory.createAsteroids(score);
        asteroids.show();
        
    }
    
}
