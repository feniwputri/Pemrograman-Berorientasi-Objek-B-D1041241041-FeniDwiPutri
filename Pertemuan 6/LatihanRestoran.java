public class LatihanRestoran {
public static void main(String[] args) {
       
        int menuCode = 1; 
        
        int quantity = 2; 

        // Variabel tambahan untuk menyimpan nama dan harga
        String namaMenu = "";
        int hargaSatuan = 0;

        // Menentukan nama menu dan harga satuan berdasarkan menuCode
        switch (menuCode) {
            case 1:
                namaMenu = "Nasi Goreng";
                hargaSatuan = 15000;
                break;
            case 2:
                namaMenu = "Mie Ayam";
                hargaSatuan = 12000;
                break;
            case 3:
                namaMenu = "Bakso";
                hargaSatuan = 10000;
                break;
            case 4:
                namaMenu = "Soto Ayam";
                hargaSatuan = 13000;
                break;
            case 5:
                namaMenu = "Es Teh";
                hargaSatuan = 3000;
                break;
            default:
                System.out.println("Kode menu tidak valid!");
                return; // Menghentikan program jika kode menu salah
        }

        // Menghitung total harga
        int totalHarga = hargaSatuan * quantity;

        // Menampilkan output sesuai format yang diharapkan
        System.out.println("=== MENU RESTORAN ===");
        System.out.println("Kode Menu: " + menuCode);
        System.out.println("Jumlah: " + quantity);
        System.out.println("\nPesanan Anda:");
        System.out.println("Nama Menu: " + namaMenu);
        System.out.println("Harga Satuan: Rp " + hargaSatuan);
        System.out.println("Jumlah: " + quantity);
        System.out.println("---");
        System.out.println("Total Bayar: Rp " + totalHarga);
    }
}
