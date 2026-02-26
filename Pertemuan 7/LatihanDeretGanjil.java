public class LatihanDeretGanjil {
    public static void main(String[] args) {
        System.out.println("=== BILANGAN GANJIL 1-15 ===");
        
        int angka = 1;
        
        while (angka <= 15) {
           
            // Kita menggunakan kondisi modulus untuk mengecek ganjil
            if (angka % 2 != 0) {

                System.out.print(angka + " ");
            }
            // Update angka agar loop tidak berjalan tanpa henti (infinite loop)
            angka++;
        }
        
        System.out.println();
    }
}
// Nama : Feni Dwi Putri
// NIM  : D1041241041