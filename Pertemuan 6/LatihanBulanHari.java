public class LatihanBulanHari {
public static void main(String[] args) {
    
        // Ubah nilai ini untuk menguji program 
        int month = 4;
        
        String namaBulan = "";
        int jumlahHari = 0;

        // Switch pertama: Untuk menentukan nama bulan
        switch (month) {
            case 1: namaBulan = "Januari"; break;
            case 2: namaBulan = "Februari"; break;
            case 3: namaBulan = "Maret"; break;
            case 4: namaBulan = "April"; break;
            case 5: namaBulan = "Mei"; break;
            case 6: namaBulan = "Juni"; break;
            case 7: namaBulan = "Juli"; break;
            case 8: namaBulan = "Agustus"; break;
            case 9: namaBulan = "September"; break;
            case 10: namaBulan = "Oktober"; break;
            case 11: namaBulan = "November"; break;
            case 12: namaBulan = "Desember"; break;
            default: namaBulan = "Tidak valid"; break;
        }

        // Gunakan switch dengan fall through untuk bulan dengan hari yang sama
        switch (month) {
            // Bulan dengan 31 hari
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                jumlahHari = 31;
                break;
                
            // Bulan dengan 30 hari
            case 4:
            case 6:
            case 9:
            case 11:
                jumlahHari = 30;
                break;
                
            // Bulan dengan 28 hari (mengabaikan tahun kabisat)
            case 2:
                jumlahHari = 28;
                break;
                
            default:
                jumlahHari = 0; // Penanda jika bulan tidak valid
                break;
        }

        // Tampilkan nama bulan dan jumlah hari
        if (jumlahHari > 0) {
            System.out.println("=== JUMLAH HARI DALAM BULAN ===");
            System.out.println("Bulan: " + namaBulan + " (bulan ke-" + month + ")");
            System.out.println("Jumlah hari: " + jumlahHari + " hari");
        } else {
            System.out.println("Error: Angka bulan tidak valid (1-12)");
        }
    }
}
// Nama : Feni Dwi Putri
// NIM  : D1041241041

