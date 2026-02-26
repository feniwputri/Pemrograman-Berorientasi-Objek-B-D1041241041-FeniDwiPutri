public class LatihanMenuHarian {
  public static void main(String[] args) {
        System.out.println("=== MENU MAKAN 3 HARI ===");
        
        // Outer loop: iterasi untuk hari (1 sampai 3)
        for (int hari = 1; hari <= 3; hari++) {
            System.out.println("Hari " + hari + ":");
            
            // Inner loop: iterasi untuk waktu makan (1 = Pagi, 2 = Siang)
            for (int waktu = 1; waktu <= 2; waktu++) {
                String namaWaktu = (waktu == 1) ? "Pagi" : "Siang";
                String menu = "";
                
                // Menentukan menu berdasarkan hari dan waktu menggunakan switch dan if-else
                switch (hari) {
                    case 1:
                        if (waktu == 1) menu = "Nasi Goreng";
                        else menu = "Soto Ayam";
                        break;
                    case 2:
                        if (waktu == 1) menu = "Bubur Ayam";
                        else menu = "Mie Goreng";
                        break;
                    case 3:
                        if (waktu == 1) menu = "Roti Bakar";
                        else menu = "Nasi Uduk";
                        break;
                }
                
                System.out.println("  " + namaWaktu + ": " + menu);
            }
            
            System.out.println(); 
        }
    }
}
// Nama : Feni Dwi Putri
// NIM  : D1041241041