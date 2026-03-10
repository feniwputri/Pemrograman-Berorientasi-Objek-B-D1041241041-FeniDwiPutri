class Persegi {
    // Atribut
    int sisi;
    int luas;
    int keliling;

    // Method untuk menghitung luas (sisi x sisi)
    public void hitungLuas() {
        luas = sisi * sisi;
    }

    // Method untuk menghitung keliling (4 x sisi)
    public void hitungKeliling() {
        keliling = 4 * sisi;
    }

    // Method untuk menampilkan hasil akhir
    public void tampilkanHasil() {
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi    : " + sisi + " cm");
        System.out.println("Luas    : " + luas + " cm²");
        System.out.println("Keliling: " + keliling + " cm");
    }
}

public class ClassPersegi {
public static void main(String[] args) {
        // Buat satu object Persegi
        Persegi persegiSatu = new Persegi();

        // Isi atribut sisi dengan nilai 5
        persegiSatu.sisi = 5;

        // Panggil method untuk melakukan perhitungan
        persegiSatu.hitungLuas();
        persegiSatu.hitungKeliling();

        // Tampilkan hasil output
        persegiSatu.tampilkanHasil();
    }
}
// Nama : Feni Dwi Putri
// NIM  : D1041241041