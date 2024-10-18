package Factory_Pattern;

public class Level2AsteroidsFactory implements AsteroidsFactory{

    @Override
    public Asteroids createAsteroids(int score) {

        if(score>1000){
            return new SiliconAsteroids();
        }
        else return new RockyAsteroids();
       
    }
    
}
