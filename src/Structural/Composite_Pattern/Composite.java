package Composite_Pattern;

import java.util.ArrayList;

public class Composite implements Component{
    public String name;

    ArrayList<Component> components;


    public Composite(){

    }

    public Composite(String name){
        this.name = name;
        components = new ArrayList<>();
    }

    public double getPrice(){
        double totalPrice=0;
        for( Component c : components){
            totalPrice += c.getPrice();
        }

        return totalPrice;
    }

    public void addComponent(Component subComponent){
        components.add(subComponent);
    }

   
    // public double getTotalPrice(){
    //     double totalPrice = 0;
    //     for(Component c: components){
    //         totalPrice += c.getPrice();
    //     }
    //     return totalPrice;
    // }
    
}
