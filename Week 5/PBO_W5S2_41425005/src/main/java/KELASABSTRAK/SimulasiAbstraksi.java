/*
Nama : Nicolas Adrian Partuaon Tambunan
Nim  : 41425005
prodi  : DIV Trpl
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KELASABSTRAK;

/**
 *
 * @author Nikolas
 */
public class SimulasiAbstraksi {
    public static void main(String[] args) {
        System.out.println("=== INI ABSTRACT CLASS ===");

        // PERCOBAAN 1: Ini ERROR kalau komentarnya dibuka,
        // karena abstract class tidak bisa dibuat objeknya langsung
        //KendaraanEkspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100);

        // PERCOBAAN 2: Buat objek dari subclass konkret (TrukBox)
        TrukBox fuso = new TrukBox("B 9081 TXT", 5000);
        fuso.infoKendaraan();                  // method warisan dari class induk
        fuso.angkutBarang("20 Unit Kulkas");   // method versi TrukBox

        System.out.println("------------------------------------");

        // Buat objek dari subclass konkret (MobilVan)
        MobilVan grandmax = new MobilVan("B 1122 KAA", 800);
        grandmax.infoKendaraan();
        grandmax.angkutBarang("50 Kotak Sepatu"); // method versi MobilVan
    }
}
/*
Eksperimen 1: Uncomment baris PERCOBAAN 1, lalu salin pesan error yang muncul.
Mengapa Java menggagalkan baris kode ini?



Error: KendaraanEkspedisi is abstract; cannot be instantiated




Jawab: 
KendaraanEkspedisi adalah abstract class, yaitu hanya konsep/blueprint
yang belum lengkap (bentuk nyatanya belum jelas, seperti "Kendaraan Ekspedisi"
di dealer). Karena itu Java melarang membuat objeknya dengan new. Objek hanya
boleh dibuat dari kelas konkret seperti TrukBox atau MobilVan.



Eksperimen 2: Buat class MotorKurir extends KendaraanEkspedisi tanpa isi method
angkutBarang(). Tuliskan dua opsi solusi dari IDE untuk error tersebut.

Error: MotorKurir is not abstract and does not override abstract method
angkutBarang(String) in KendaraanEkspedisi



Jawab: Dua opsi solusi dari IDE:
1. Implement all abstract methods (IDE membuatkan method angkutBarang() di
   MotorKurir).
2. Make class MotorKurir abstract MotorKurir dijadikan abstract class

*/

