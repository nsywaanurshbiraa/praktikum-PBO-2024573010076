package modul_5.praktikum_3;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" SISTEM MANAJEMEN PRODUK");

        // Membuat produk dengan PIN
        Product laptop = new Product("Laptop ASUS", 8500000, 15, "1234");
        Product mouse = new Product("Mouse Logitech", 150000, 50, "1234");

        System.out.println("\n PRODUK BERHASIL DIBUAT");
        laptop.tampilkanInfo();
        mouse.tampilkanInfo();

        // TEST READ-ONLY PROPERTIES
        System.out.println(" TEST READ-ONLY PROPERTIES");
        System.out.println("Product ID (read-only): " + laptop.getProductId());
        System.out.println("Created At (read-only): " + laptop.getCreatedAt());
        System.out.println("✔ Properti ini tidak bisa diubah setelah dibuat.\n");

        // TEST READ-WRITE PROPERTIES
        System.out.println(" TEST READ-WRITE PROPERTIES");

        System.out.println("\n Coba ubah harga dengan PIN salah:");
        laptop.setHarga(9000000, "0000");

        System.out.println("\n Ubah harga dengan PIN benar:");
        laptop.setHarga(9000000, "1234");

        System.out.println("\n Ubah nama produk:");
        laptop.setNama("Laptop ASUS ROG", "1234");

        System.out.println("\n Ubah stok:");
        laptop.setStok(20, "1234");

        // TEST WRITE-ONLY PROPERTY
        System.out.println("\n TEST WRITE-ONLY PROPERTY (PIN)");
        System.out.println("PIN tidak bisa dibaca langsung (tidak ada getter).");
        laptop.changeAdminPin("1234", "5678");
        laptop.changeAdminPin("0000", "9999"); // Akan gagal

        // TEST COMPUTED PROPERTIES
        System.out.println("\n TEST COMPUTED PROPERTIES");
        System.out.printf("Total Nilai Laptop : Rp %.2f%n", laptop.getTotalNilai());
        System.out.println("Status Stok Laptop : " + laptop.getStatusStok());
        System.out.printf("Total Nilai Mouse  : Rp %.2f%n", mouse.getTotalNilai());
        System.out.println("Status Stok Mouse  : " + mouse.getStatusStok());

        // TEST BUSINESS METHODS
        System.out.println("\n TEST BUSINESS METHODS");
        System.out.println("\n️ Tambah stok laptop:");
        laptop.tambahStok(10, "5678"); // PIN sudah diubah

        System.out.println("\n️ Kurangi stok mouse (penjualan):");
        mouse.kurangiStok(45);

        System.out.println("\n️ Kurangi stok mouse lagi (stok menipis):");
        mouse.kurangiStok(4);

        System.out.println("\n️ Coba kurangi stok lebih dari tersedia:");
        mouse.kurangiStok(10);

        // TAMPILKAN INFO AKHIR
        System.out.println("\n INFORMASI PRODUK SETELAH UPDATE");
        laptop.tampilkanInfo();
        mouse.tampilkanInfo();

        // RINGKASAN ENCAPSULATION
        System.out.println("\n RINGKASAN ENCAPSULATION");
        System.out.println("------------------------------");
        System.out.println("READ-ONLY  : productId, createdAt");
        System.out.println("READ-WRITE : nama, harga, stok (dengan validasi PIN)");
        System.out.println("WRITE-ONLY : adminPin (tidak bisa dibaca)");
        System.out.println("COMPUTED   : totalNilai, statusStok (dihitung otomatis)");
    }
}
