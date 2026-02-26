public class LatihanValidasi {
 public static void main(String[] args) {
        System.out.println("=== VALIDASI NILAI UJIAN ===");
        
        int nilai;
        
        // Array untuk mensimulasikan 3 percobaan input: -10, 150, 85
        int[] simulasiInput = {-10, 150, 85};
        int indexInput = 0;
        
        do {
            nilai = simulasiInput[indexInput];
            System.out.println("\nPercobaan input: " + nilai);
            
            // Cek apakah nilai valid (0 <= nilai <= 100)
            if (nilai < 0 || nilai > 100) {
                System.out.println("Error: Nilai harus antara 0-100!");
            } else {
                System.out.println("✓ Nilai valid: " + nilai);
            }
            
            // Lanjut ke simulasi input berikutnya
            indexInput++;
            
        } while (nilai < 0 || nilai > 100); // Loop terus berjalan jika nilai tidak valid
    }
}
