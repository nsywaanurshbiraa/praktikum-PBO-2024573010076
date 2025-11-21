package modul_8.praktikum_1;

public abstract class Shape {
    protected String color;
    protected Boolean filled;

    //constructor
    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    //abstract methods - harus diimplementasikan subclass
    public abstract double calcuLateArea();
    public abstract double calcuLatePerimeter();

    //constructor methods - sudah memilki implementasi
    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setFilled() {
        this.filled = filled;
    }

    //concrete method yang bisa di override
    public void displayInfo() {
        System.out.println("shape color :" + color);
        System.out.println("filled " + filled);
    }
}
