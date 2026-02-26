public class LatihanCariKelipatan {
 public static void main(String[] args) {
        System.out.println("=== CARI KELIPATAN 7 ===");
        
        // Gunakan for loop 1-50
        for (int i = 1; i <= 50; i++) {
            System.out.println("Cek: " + i);
            
            // Gunakan if untuk cek kelipatan 7
            if (i % 7 == 0) {
                System.out.println("✓ Kelipatan 7 pertama: " + i);
                
                break;
            }
        }
        
        System.out.println("Pencarian selesai.");
    }
}
// Nama : Feni Dwi Putri
// NIM  : D1041241041