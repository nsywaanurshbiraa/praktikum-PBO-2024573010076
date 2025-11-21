package modul_8.praktikum_1;

public class Circle extends Shape{
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    // Implementasi abstract methods
    @Override
    public double calcuLateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calcuLatePerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override concrete method
    @Override
    public void displayInfo() {
        System.out.println("CIRCLE");
        super.displayInfo();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calcuLateArea());
        System.out.println("Perimeter: " + calcuLatePerimeter());
        System.out.println("================");
    }

    // Method khusus Circle
    public double getDiameter() {
        return 2 * radius;
    }
}
