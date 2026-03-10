class Buku {
    // Atribut
    String judul;
    String pengarang;
    int harga;

    // Method untuk menampilkan informasi buku
    void tampilkanInfo() {
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul    : " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Harga    : Rp " + harga);
        System.out.println(); // Menambahkan baris kosong sebagai pemisah
    }
}
public class ClassBuku {
public static void main(String[] args) {
        // Buat object pertama dari class Buku
        Buku buku1 = new Buku();
        
        // Isi atribut untuk object buku1
        buku1.judul = "Pemrograman Java";
        buku1.pengarang = "Budi Raharjo";
        buku1.harga = 125000;

        // Buat object kedua dari class Buku
        Buku buku2 = new Buku();
        
        // Isi atribut untuk object buku2 dengan data yang berbeda
        buku2.judul = "Algoritma dan Struktur Data";
        buku2.pengarang = "Rinaldi Munir";
        buku2.harga = 150000;

        // Panggil method tampilkanInfo() untuk setiap object
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
    }
}
// Nama : Feni Dwi Putri
// NIM  : D1041241041
