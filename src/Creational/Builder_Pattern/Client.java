package Builder_Pattern;


//client class
public class Client {

    public static void main(String[] args) {
        HouseContractor houseContractor = new HouseContractor();

        //build a wooden house
        HouseBuilder woodenHouseBuilder = new WoodenHouseBuilder();
        houseContractor.setHouseBuilder(woodenHouseBuilder);
        houseContractor.constructHouse();
        House woodenHouse = houseContractor.getHouse();
        System.out.println(woodenHouse);
        

        //build a brick house
        HouseBuilder brickHouseBuilder = new BrickHouseBuilder();
        houseContractor.setHouseBuilder(brickHouseBuilder);
        houseContractor.constructHouse();
        House brickHouse = houseContractor.getHouse();
        System.out.println(brickHouse);
    }
    
}
