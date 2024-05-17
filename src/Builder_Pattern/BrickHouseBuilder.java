package Builder_Pattern;


//concrete builder
public class BrickHouseBuilder  implements HouseBuilder{
    private House house;

    public BrickHouseBuilder(){
        this.house = new House();
    }

    public void buildMaterial(){
        house.setMaterial("Brick & Concrete");
    }

    public void buildFoundation(){
        house.setFoundation("Tiles");
    }

    public void buildRoof(){
        house.setRoof("Concrete");
    }

    public void buildInterior(){
        house.setInterior("Glass");
    }

    public House getHouse(){
        return house;
    }
    
}
