/*
Nama : Nicolas Adrian Partuaon Tambunan
Nim  : 41425005
prodi  : DIV Trpl
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overloading;

/**
 *
 * @author Nikolas
 */
class MesinTarif {
    // Kota asal pengiriman (hanya bisa diakses dari dalam kelas ini)
    private String kotaAsal;

    // Constructor: menyimpan kota asal saat objek dibuat
    public MesinTarif(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }

    // ongkir biasa = berat x Rp 10.000 per Kg
    public double hitungOngkir(double beratKg) {
        return beratKg * 10000;
    }

   // ongkir + asuransi 1% dari nilai barang
    public double hitungOngkir(double beratKg, double nilaiBarang) {
        double biayaAsuransi = nilaiBarang * 0.01;
        return (beratKg * 10000) + biayaAsuransi;
    }

    //  kalau express (true), tambah Rp 20.000
    public double hitungOngkir(double beratKg, boolean isExpress) {
        double total = beratKg * 10000;
        if (isExpress) {
            total += 20000;
        }
        return total;
    }
}

