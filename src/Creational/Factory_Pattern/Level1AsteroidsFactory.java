package Factory_Pattern;

public class Level1AsteroidsFactory implements AsteroidsFactory{

    @Override
    public Asteroids createAsteroids(int score) {

        if(score>500){
            return new IronAsteroids();
        }
        else{
            return new IceAsteroids();
        }
        
    }
    
}
