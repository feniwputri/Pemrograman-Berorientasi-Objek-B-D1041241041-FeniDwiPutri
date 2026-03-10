// Nama class diubah menjadi MobilLatihan agar tidak bentrok dengan file Mobil.java yang sudah ada
class MobilLatihan {
    String merk;
    String warna;
    int tahun;

    // Constructor 1: Tanpa parameter 
    public MobilLatihan() {
        this.merk = "Belum diisi";
        this.warna = "Belum diisi";
        this.tahun = 0;
    }

    // Constructor 2: 1 parameter 
    public MobilLatihan(String merk) {
        this.merk = merk;
        this.warna = "Belum diisi";
        this.tahun = 0;
    }

    // Constructor 3: 3 parameter 
    public MobilLatihan(String merk, String warna, int tahun) {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }

    // Method untuk menampilkan spesifikasi
    public void tampilkanSpesifikasi() {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk : " + this.merk);
        System.out.println("Warna: " + this.warna);
        System.out.println("Tahun: " + this.tahun);
        System.out.println();
    }
}

public class LatihanMobilConstructor {
    public static void main(String[] args) {
        // Menggunakan nama class MobilLatihan yang baru agar tidak error
        MobilLatihan mobil1 = new MobilLatihan();
        MobilLatihan mobil2 = new MobilLatihan("Toyota");
        MobilLatihan mobil3 = new MobilLatihan("Honda Civic", "Merah", 2023);

        // Tampilkan spesifikasi
        mobil1.tampilkanSpesifikasi();
        mobil2.tampilkanSpesifikasi();
        mobil3.tampilkanSpesifikasi();
    }
}
// Nama : Feni Dwi Putri
// NIM  : D1041241041