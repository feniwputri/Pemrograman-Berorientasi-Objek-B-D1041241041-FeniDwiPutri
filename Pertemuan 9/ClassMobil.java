class Mobil {
    // Atribut
    String merk;
    String warna;
    int tahun;
    int kecepatan = 0; // Default: 0

    // Method untuk menampilkan spesifikasi
    public void tampilkanSpesifikasi() {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk  : " + merk);
        System.out.println("Warna : " + warna);
        System.out.println("Tahun : " + tahun);
        System.out.println();
    }

    // Method untuk menambah kecepatan
    public void percepat() {
        kecepatan = kecepatan + 20;
        System.out.println("Mobil dipercepat...");
    }

    // Method untuk menampilkan kecepatan saat ini
    public void tampilkanKecepatan() {
        System.out.println("Kecepatan saat ini: " + kecepatan + " km/jam");
    }
}
public class ClassMobil {
public static void main(String[] args) {
        // Buat satu object Mobil
        Mobil mobilku = new Mobil();

        // Isi atribut mobil 
        mobilku.merk = "Toyota Avanza";
        mobilku.warna = "Silver";
        mobilku.tahun = 2020;

        mobilku.tampilkanSpesifikasi();

        // Panggil percepat() dua kali
        mobilku.percepat();
        mobilku.percepat();

        mobilku.tampilkanKecepatan();
    }
}
// Nama : Feni Dwi Putri
// NIM  : D1041241041