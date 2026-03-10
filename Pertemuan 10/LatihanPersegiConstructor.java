// Nama class diubah menjadi PersegiLatihan agar tidak bentrok dengan file lain
class PersegiLatihan {
    int sisi;
    int luas;
    int keliling;

    // Constructor dengan 1 parameter dan validasi
    public PersegiLatihan(int sisi) {
        if (sisi <= 0) {
            System.out.println("ERROR: Sisi tidak boleh <= 0. Diset ke default (1).");
            this.sisi = 1;
        } else {
            this.sisi = sisi;
        }
        
        // Langsung hitung luas dan keliling di constructor
        this.luas = this.sisi * this.sisi;
        this.keliling = 4 * this.sisi;
    }

    // Method untuk menampilkan hasil perhitungan
    public void tampilkanHasil() {
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi    : " + this.sisi + " cm");
        System.out.println("Luas    : " + this.luas + " cm²");
        System.out.println("Keliling: " + this.keliling + " cm");
        System.out.println();
    }
}

public class LatihanPersegiConstructor {
    public static void main(String[] args) {
        // 1. Membuat objek dengan sisi valid (5) menggunakan class PersegiLatihan
        PersegiLatihan persegi1 = new PersegiLatihan(5);
        persegi1.tampilkanHasil();

        // 2. Membuat objek dengan sisi invalid (-3)
        PersegiLatihan persegi2 = new PersegiLatihan(-3);
        persegi2.tampilkanHasil();
    }
}
// Nama : Feni Dwi Putri
// NIM  : D1041241041