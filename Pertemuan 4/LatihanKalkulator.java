public class LatihanKalkulator {
 public static void main(String[] args) {
        // Deklarasi variabel
        int angka1 = 25;
        int angka2 = 4;

        // Operasi aritmatika dasar
        int penjumlahan = angka1 + angka2;
        int pengurangan = angka1 - angka2;
        int perkalian = angka1 * angka2;
        int pembagian = angka1 / angka2; // Pembagian integer (hasil bulat)
        int sisaBagi = angka1 % angka2;  // Modulus (sisa hasil bagi)

        // Pembagian desimal menggunakan type casting
        // Salah satu operand harus di-cast ke double agar hasilnya desimal
        double pembagianDesimal = (double) angka1 / angka2;

        // Tampilkan hasil sesuai format output
        System.out.println("=== KALKULATOR ===");
        System.out.println("Angka 1: " + angka1);
        System.out.println("Angka 2: " + angka2);
        
        System.out.println("---");
        
        System.out.println("Penjumlahan: " + penjumlahan);
        System.out.println("Pengurangan: " + pengurangan);
        System.out.println("Perkalian: " + perkalian);
        System.out.println("Pembagian: " + pembagian);
        System.out.println("Sisa Bagi: " + sisaBagi);
        System.out.println("Pembagian Desimal: " + pembagianDesimal);
    }
}

// Nama : Feni Dwi Putri
// NIM  : D1041241041
// Tanggal : 18 Februari 2026