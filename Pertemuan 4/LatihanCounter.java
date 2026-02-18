public class LatihanCounter {
  public static void main(String[] args) {
        // Inisialisasi variabel counter
        int counter = 10;

        // Tampilkan nilai awal
        System.out.println("=== COUNTER ===");
        System.out.println("Nilai awal: " + counter);

        // Operasi Increment (++) sebanyak 2 kali
        counter++; 
        counter++;
        System.out.println("Setelah ++ (2x): " + counter);

        // Operasi Decrement (--) sebanyak 1 kali
        counter--;
        System.out.println("Setelah --: " + counter);

        // Menambah nilai counter dengan 5
        counter += 5;
        System.out.println("Setelah += 5: " + counter);

        // Mengurangi nilai counter dengan 3
        counter -= 3;
        System.out.println("Setelah -= 3: " + counter);

        // 7. Compound Assignment (*= 2)
        // Mengalikan nilai counter dengan 2
        counter *= 2;
        System.out.println("Setelah *= 2: " + counter);
    }
}
// Nama : Feni Dwi Putri
// NIM  : D1041241041
// Tanggal : 18 Februari 2026
