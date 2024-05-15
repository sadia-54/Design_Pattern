package Task.Pizza_Topping;

public class MainPizza {
    public static void main(String[] args) {
        
        MargheritaPizza pizza1 = new MargheritaPizza();
        PepperoniPizza pizza2 = new PepperoniPizza();

        System.out.println("Toppings for Margherita Pizza: " + String.join(", ", pizza1.getToppings()));
        System.out.println("Toppings for Pepperoni Pizza: " + String.join(", ", pizza2.getToppings()));
    }
}
