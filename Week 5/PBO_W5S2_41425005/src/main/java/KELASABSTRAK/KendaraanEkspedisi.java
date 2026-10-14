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
// Class abstrak: kerangka umum kendaraan (tidak bisa dibuat objeknya langsung)
abstract class KendaraanEkspedisi {
    protected String noPolisi;   // plat nomor (bisa diakses class turunan)
    protected int kapasitasKg;   // daya angkut maksimal

    // Constructor: mengisi plat nomor dan kapasitas
    public KendaraanEkspedisi(String noPolisi, int kapasitasKg) {
        this.noPolisi = noPolisi;
        this.kapasitasKg = kapasitasKg;
    }

    // Method biasa: dipakai bersama oleh semua kendaraan
    public void infoKendaraan() {
        System.out.println("Plat Nomor: " + noPolisi + " | Daya Angkut: " + kapasitasKg + " Kg");
    }

    // Method abstrak: tanpa isi, wajib ditulis ulang oleh class turunan
    public abstract void angkutBarang(String namaBarang);
}

// Class turunan: Truk Box
class TrukBox extends KendaraanEkspedisi {
    public TrukBox(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg); // kirim data ke constructor induk
    }

    // Implementasi cara truk mengangkut barang
    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Truk [" + noPolisi + "] memuat '" + namaBarang +
                           "' ke dalam kontainer tertutup pendingin.");
    }
}

// Class turunan: Mobil Van
class MobilVan extends KendaraanEkspedisi {
    public MobilVan(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    // Implementasi cara van mengangkut barang
    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Mobil Van [" + noPolisi + "] memuat '" + namaBarang +
                           "' di bagasi belakang untuk distribusi kota.");
    }
}

