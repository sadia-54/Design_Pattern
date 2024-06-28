package Prototype_Pattern;

class Sheep implements Cloneable {

    private String color;
    private double weight;
    private int age;

    public Sheep(String color, double weight, int age){
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public Sheep clone() throws CloneNotSupportedException{
        return (Sheep) super.clone();
    }

    public void displayInfo(){
        System.out.println("Sheep color: "+ color+ " weight: "+ weight+ " age: "+ age);
    }

}

public class FarmSimulation {
    public static void main(String[] args) throws CloneNotSupportedException {

        Sheep originalSheep = new Sheep("White", 67.00, 3);
        Sheep clonedSheep = originalSheep.clone();

        System.out.println("Original sheep: ");
        originalSheep.displayInfo();

        System.out.println("\nCloned sheep: ");
        clonedSheep.displayInfo();
    }
}