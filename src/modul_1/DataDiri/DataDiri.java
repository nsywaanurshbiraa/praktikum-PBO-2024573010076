package modul_1.DataDiri;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataDiri {
    public static void main(String[] args){
        System.out.println("Nasywa Nurshabira");
        String nama = "Nasywa Nurshabira";
        String nim = "2024573010076";
        LocalDate TglLahir = LocalDate.of(2005,5,31);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = TglLahir.format(formatter);
        String alamat = "Matang";
        String prodi = "Teknik Informatika";
        String jurusan = "Teknologi Informasi dan Komputer";
        System.out.println("Nama :" + nama);
        System.out.println("NIM :" + nim);
        System.out.println("Tanggal Lahir :" + formattedDate);
        System.out.println("Alamat :" + alamat);
        System.out.println("Prodi :" + prodi);
        System.out.println("Jurusan :" + jurusan);
    }
}
