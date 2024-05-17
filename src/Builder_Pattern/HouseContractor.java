package Builder_Pattern;


//director class
public class HouseContractor {
    private HouseBuilder houseBuilder;

    public void setHouseBuilder(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public House getHouse(){
        return houseBuilder.getHouse();
    }

    public void constructHouse(){
        houseBuilder.buildMaterial();
        houseBuilder.buildFoundation();
        houseBuilder.buildRoof();
        houseBuilder.buildInterior();
    }

}
