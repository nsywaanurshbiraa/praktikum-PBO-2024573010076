package modul_4_latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        KartuRencanaStudi krs = new KartuRencanaStudi(nim, nama);

        int pilihan;
        do {
            System.out.println("\n====================================");
            System.out.println("Menu KRS Mahasiswa");
            System.out.println("====================================");
            System.out.println("| 1. Tambah Mata Kuliah           |");
            System.out.println("| 2. Tampilkan KRS                |");
            System.out.println("| 3. Hitung Total SKS dan IPK     |");
            System.out.println("| 4. Hapus Mata Kuliah            |");
            System.out.println("| 5. Nilai Terbaik                |");
            System.out.println("| 6. Nilai Terburuk               |");
            System.out.println("| 7. Keluar                       |");
            System.out.println("====================================");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode mata kuliah: ");
                    String kode = input.nextLine();
                    System.out.print("Masukkan nama mata kuliah: ");
                    String namaMatkul = input.nextLine();
                    System.out.print("Masukkan jumlah SKS: ");
                    int sks = input.nextInt();
                    System.out.print("Masukkan nilai (0-4): ");
                    double nilai = input.nextDouble();
                    input.nextLine();

                    Matakuliah matkul = new Matakuliah(kode, namaMatkul, sks, nilai);
                    krs.tambahMatakuliah(matkul);
                    break;

                case 2:
                    krs.tampilkanKRS();
                    break;

                case 3:
                    System.out.println("Total SKS: " + krs.hitungTotalSKS());
                    System.out.println("IPK: " + String.format("%.2f", krs.hitungIPK()));
                    break;

                case 4:
                    System.out.print("Masukkan kode mata kuliah yang ingin dihapus: ");
                    String kodeHapus = input.nextLine();
                    krs.hapusMatakuliah(kodeHapus);
                    break;

                case 5:
                    krs.tampilkanNilaiTerbaik();
                    break;

                case 6:
                    krs.tampilkanNilaiTerburuk();
                    break;

                case 7:
                    System.out.println("Terima kasih! Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 7);

        input.close();
    }
}
