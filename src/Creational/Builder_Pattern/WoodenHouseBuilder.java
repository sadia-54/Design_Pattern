package Builder_Pattern;


//concrete builder
public class WoodenHouseBuilder implements HouseBuilder{
    private House house;

    public WoodenHouseBuilder(){
        this.house = new House();
    }

    public void buildMaterial(){
        house.setMaterial("Wood");
    }

    public void buildFoundation(){
        house.setFoundation("Wooden Piles");
    }

    public void buildRoof(){
        house.setRoof("Wood Shingles");
    }

    public void buildInterior(){
        house.setInterior("Wooden Furnitures");
    }
    
    public House getHouse(){
        return house;
    }
    
}
