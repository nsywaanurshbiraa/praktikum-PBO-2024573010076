package modul_2;
//Langkah 1: Perulangan For

public class ForLoopDemo {
    public static void main(String[] args) {
        //Contoh 1: Menampilkan angka 1-10
        System.out.println("=== Angka 1-10 ===");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Contoh 2: Menampilkan angka genap
        System.out.println("=== Angka genap 2-20 ===");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Contoh 3: Countdown
        System.out.println("=== Countdown ===");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("Start!");

        //Contoh 4: Tabel perkalian
        System.out.println("=== Tabel perkalian 5 ===");
        for (int i = 1; i <= 10; i++) {
            System.out.print("5 x " + i + " = " + (5 * i));
        }
    }
}
