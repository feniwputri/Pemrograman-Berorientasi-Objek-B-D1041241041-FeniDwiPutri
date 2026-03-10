// Nama class diubah jadi BukuData agar tidak bentrok dengan file lama yang error
class BukuData {
    String judul;
    String pengarang;
    int harga;

    // Constructor 1: Default
    public BukuData() {
        this.judul = "Belum diisi";
        this.pengarang = "Belum diisi";
        this.harga = 0;
    }

    // Constructor 2: Dengan parameter (this)
    public BukuData(String judul, String pengarang, int harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }

    // Method tampilkan info
    public void tampilkanInfo() {
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul     : " + this.judul);
        System.out.println("Pengarang : " + this.pengarang);
        System.out.println("Harga     : Rp " + this.harga);
        System.out.println();
    }
}

public class LatihanBukuConstructor {
    public static void main(String[] args) {
        // Menggunakan class BukuData yang baru
        BukuData buku1 = new BukuData();
        BukuData buku2 = new BukuData("Pemrograman Java", "Budi Raharjo", 125000);
        BukuData buku3 = new BukuData("Algoritma dan Struktur Data", "Rinaldi Munir", 150000);

        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
        buku3.tampilkanInfo();
    }
}
// Nama : Feni Dwi Putri
// NIM  : D1041241041