package Builder_Pattern;


//builder interface
public interface HouseBuilder {
    void buildMaterial();
    void buildFoundation();
    void buildRoof();
    void buildInterior();

    House getHouse();
}
