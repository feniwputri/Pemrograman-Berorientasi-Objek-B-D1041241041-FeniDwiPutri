class ObjectDanClass {
String merk;
String warna;
int tahun;
int kecepatan;


public void tampilkanInfo() {
System.out.println("Merk: " + merk);
System.out.println("Warna: " + warna);
System.out.println("Tahun: " + tahun);
System.out.println("Kecepatan: " + kecepatan + " " + "km/h");
}

public class Main {
public static void main(String[] args) {
    ObjectDanClass mobil1 = new ObjectDanClass();
    mobil1.merk = "Porsche";
    mobil1.warna= "Merah";
    mobil1.tahun = 2018;
    mobil1.kecepatan = 90;

   System.out.println("Informasi Mobil: ");
   mobil1.tampilkanInfo();
}
}
}

// Nama : Feni Dwi Putri
// NIM  : D1041241041
// Tanggal : 20 Februari 2026


