public class LatihanProduk {
public static void main(String[] args) {
        // Deklarasi variabel data produk
        String namaProduk = "Laptop Asus";
        int hargaSatuan = 7000000;
        int jumlahStok = 15;
        boolean statusTersedia = true;        
        final double PAJAK = 0.11;

        // Hitung total nilai stok = harga satuan * jumlah stok
        int totalNilaiStok = hargaSatuan * jumlahStok;

        // Hitung pajak = total nilai stok * PAJAK
        // Hasil dikonversi ke (int) agar tampilan angka bulat sesuai output di gambar
        int nilaiPajak = (int) (totalNilaiStok * PAJAK);

        // Menampilkan hasil ke layar
        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga Satuan: Rp " + hargaSatuan);
        System.out.println("Jumlah Stok: " + jumlahStok);
        System.out.println("Status Tersedia: " + statusTersedia);
        System.out.println("---");
        System.out.println("Total Nilai Stok: Rp " + totalNilaiStok);
        // Menampilkan persentase pajak (11%) secara manual di string agar sesuai format
        System.out.println("Pajak (11%): Rp " + nilaiPajak);
    }
}
// Nama : Feni Dwi Putri
// NIM  : D1041241041
// Tanggal : 18 Februari 2026

