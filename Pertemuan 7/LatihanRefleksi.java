public class LatihanRefleksi {
 public static void main(String[] args) {
        
        // MENGGUNAKAN WHILE 
        System.out.println("=== MENGGUNAKAN WHILE ===");
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(); 
        System.out.println(); 
        
        // 2. MENGGUNAKAN DO-WHILE 
        System.out.println("=== MENGGUNAKAN DO-WHILE ===");
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 5);
        System.out.println(); 
        System.out.println();
        
        // MENGGUNAKAN FOR 
        System.out.println("=== MENGGUNAKAN FOR ===");
        for (int k = 1; k <= 5; k++) {
            System.out.print(k + " ");
        }
        System.out.println(); 

        /*
         For loop paling mudah dipahami untuk perulangan yang sudah jelas batasnya,
         karena semua kontrol ada dalam satu baris sehingga lebih ringkas dan rapi.
         */
    }
}
