package modul_4_latihan;

public class KartuRencanaStudi {
    private String nim;
    private String nama;
    private Matakuliah[] daftarMatakuliah;
    private int jumlahMatkul;
    private int maxMatkul = 10;

    public KartuRencanaStudi(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        daftarMatakuliah = new Matakuliah[maxMatkul];
        jumlahMatkul = 0;
    }

    // Menambah mata kuliah dengan validasi total SKS
    public boolean tambahMatakuliah(Matakuliah matkul) {
        int totalSksSetelahTambah = hitungTotalSKS() + matkul.getSks();

        if (jumlahMatkul < maxMatkul && totalSksSetelahTambah <= 24) {
            daftarMatakuliah[jumlahMatkul] = matkul;
            jumlahMatkul++;
            System.out.println("\nNote: Mata kuliah " + matkul.getNama() + " berhasil ditambahkan.");
            return true;
        } else if (totalSksSetelahTambah > 24) {
            System.out.println("\nNote: Tidak dapat menambahkan " + matkul.getNama() + ". Total SKS melebihi batas 24!");
            return false;
        } else {
            System.out.println("\nNote: KRS sudah penuh! Maksimal " + maxMatkul + " mata kuliah.");
            return false;
        }
    }

    // Menghapus mata kuliah berdasarkan kode
    public boolean hapusMatakuliah(String kode) {
        for (int i = 0; i < jumlahMatkul; i++) {
            if (daftarMatakuliah[i].getKode().equalsIgnoreCase(kode)) {
                for (int j = i; j < jumlahMatkul - 1; j++) {
                    daftarMatakuliah[j] = daftarMatakuliah[j + 1];
                }
                daftarMatakuliah[jumlahMatkul - 1] = null;
                jumlahMatkul--;
                System.out.println("Mata kuliah dengan kode " + kode + " berhasil dihapus!");
                return true;
            }
        }
        System.out.println("Mata kuliah dengan kode " + kode + " tidak ditemukan!");
        return false;
    }

    // Menghitung total SKS
    public int hitungTotalSKS() {
        int total = 0;
        for (int i = 0; i < jumlahMatkul; i++) {
            total += daftarMatakuliah[i].getSks();
        }
        return total;
    }

    // Menghitung IPK sederhana
    public double hitungIPK() {
        double totalNilai = 0;
        int totalSks = 0;

        for (int i = 0; i < jumlahMatkul; i++) {
            totalNilai += daftarMatakuliah[i].getNilai() * daftarMatakuliah[i].getSks();
            totalSks += daftarMatakuliah[i].getSks();
        }

        return totalSks == 0 ? 0 : totalNilai / totalSks;
    }

    // Menampilkan seluruh KRS
    public void tampilkanKRS() {
        System.out.println("\n====================================");
        System.out.println("Kartu Rencana Studi");
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("====================================");
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("\nMata Kuliah ke-" + (i + 1));
            daftarMatakuliah[i].tampilkanInfo();
        }
        System.out.println("====================================");
        System.out.println("Total SKS : " + hitungTotalSKS());
        System.out.println("IPK       : " + String.format("%.2f", hitungIPK()));
    }

    // Menampilkan nilai terbaik
    public void tampilkanNilaiTerbaik() {
        if (jumlahMatkul == 0) {
            System.out.println("Belum ada mata kuliah yang diambil.");
            return;
        }

        Matakuliah terbaik = daftarMatakuliah[0];
        for (int i = 1; i < jumlahMatkul; i++) {
            if (daftarMatakuliah[i].getNilai() > terbaik.getNilai()) {
                terbaik = daftarMatakuliah[i];
            }
        }

        System.out.println("\nMata kuliah dengan nilai terbaik:");
        terbaik.tampilkanInfo();
    }

    // Menampilkan nilai terburuk
    public void tampilkanNilaiTerburuk() {
        if (jumlahMatkul == 0) {
            System.out.println("Belum ada mata kuliah yang diambil.");
            return;
        }

        Matakuliah terburuk = daftarMatakuliah[0];
        for (int i = 1; i < jumlahMatkul; i++) {
            if (daftarMatakuliah[i].getNilai() < terburuk.getNilai()) {
                terburuk = daftarMatakuliah[i];
            }
        }

        System.out.println("\nMata kuliah dengan nilai terburuk:");
        terburuk.tampilkanInfo();
    }
}
