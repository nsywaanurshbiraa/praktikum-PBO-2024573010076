package modul_6.praktikum_3;

public class InheritanceTypeTest {
    public static void main(String[] args) {
        // Multilevel inheritance test
        Dog dog = new Dog("Buddy", "Brown", "Golden Retriever");
        dog.eat();        // dari Animal, di-override di Dog
        dog.sleep();      // dari Animal
        dog.giveBirth();  // dari Mammal
        dog.bark();       // dari Dog

        System.out.println();

        // Hierarchical inheritance test
        Cat cat = new Cat("Whiskers", "White", true);
        cat.eat();        // di-override di Cat
        cat.sleep();      // dari Animal
        cat.giveBirth();  // dari Mammal
        cat.meow();       // dari Cat

        System.out.println();

        // Polymorphism dengan hierarchical inheritance
        Animal[] animals = {
                new Dog("Max", "Black", "Labrador"),
                new Cat("Luna", "Gray", false)
        };

        for (Animal animal : animals) {
            animal.eat(); // akan memanggil method sesuai objek sebenarnya
        }
    }
}
