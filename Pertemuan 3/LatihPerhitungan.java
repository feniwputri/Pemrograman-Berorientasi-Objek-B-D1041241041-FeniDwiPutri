public class LatihPerhitungan {

public static void main(String[] args) {
        // 1. Inisialisasi variabel saldo awal (tipe int)
        int saldo = 2000000;

        // Tampilkan Header dan Saldo Awal
        System.out.println("=== SIMULASI TRANSAKSI BANK ===");
        System.out.println("Saldo Awal : " + saldo);

        // 2. Simulasi Setoran (Tambah 450.000)
        int setoran = 450000;
        System.out.println("Setoran : " + setoran);
        
        // Update nilai saldo (saldo = saldo + setoran)
        saldo += setoran; 
        System.out.println("Saldo Setelah Setor : " + saldo);

        // 3. Simulasi Penarikan (Kurang 250.000)
        int penarikan = 250000;
        System.out.println("Penarikan : " + penarikan);
        
        // Update nilai saldo (saldo = saldo - penarikan)
        saldo -= penarikan;
        System.out.println("Saldo Akhir : " + saldo);
    }
}
// Nama : Feni Dwi Putri
// NIM  : D1041241041
// Tanggal : 13 Februari 2025