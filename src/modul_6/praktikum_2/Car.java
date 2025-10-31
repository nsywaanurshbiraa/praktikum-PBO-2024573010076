package modul_6.praktikum_2;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed); // Memanggil constructor dari Vehicle
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void start() {
        super.start(); // Panggil method start() dari Vehicle dulu
        System.out.println("Car engine is running smoothly");
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Tampilkan info dari Vehicle
        System.out.println("Number of doors: " + numberOfDoors);
    }

    public void honk() {
        System.out.println("Beep beep!");
    }
}
