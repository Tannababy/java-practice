package udemyLessons.electronics;

public class Computer extends Device{

    int ram;
    int storage;

    public Computer(String brand, String model, int ram, int storage) {
        super(brand, model);
        this.ram = ram;
        this.storage = storage;
    }

    @Override
    void powerOn() {
        System.out.println("The Computer is powering on.");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("RAM: "+ ram);
        System.out.println("Storage: "+ storage);
    }
}
