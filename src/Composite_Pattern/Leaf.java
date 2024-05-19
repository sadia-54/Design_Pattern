package Composite_Pattern;

public class Leaf implements Component{
    public String name;
    public double price;

    public Leaf(){

    }

    public Leaf(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    // public void getPrice() {
      
    //     System.out.println("The Price of "+this.name+ "= "+this.price);
    // }

    public double getPrice(){
        return this.price;
    }
        
}
