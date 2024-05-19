package Composite_Pattern;

public class Client {
    public static void main(String[] args) {

        // all the leaf components
        Component hdd = new Leaf("HDD", 4000);
        Component ram = new Leaf("RAM", 5000);
        Component processor = new Leaf("Processor", 12000);
        Component keyboard = new Leaf("Keyboard", 2000);
        Component mouse = new Leaf("Mouse", 1000);

        //all the composite components
        Composite motherboard = new Composite("MotherBoard");
        Composite cabinet = new Composite("Cabinet");
        Composite peripheral = new Composite("Peripheral");
        Composite computer = new Composite("Computer");

        motherboard.addComponent(ram);
        motherboard.addComponent(processor);

        //total price of motherboard
        System.out.println("Total price of motherBoard: "+motherboard.getPrice());

        cabinet.addComponent(hdd);
        cabinet.addComponent(motherboard);

        //total price of cabinet
        System.out.println("Total price of cabinet: "+cabinet.getPrice());

        peripheral.addComponent(keyboard);
        peripheral.addComponent(mouse);

        //total price of peripheral
        System.out.println("Total price of peripheral: "+peripheral.getPrice());

        computer.addComponent(cabinet);
        computer.addComponent(peripheral);

        //total price of computer
        System.out.println("Total price of Computer: "+computer.getPrice());

    }
    
}
