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
public class SimulasiOverloading {
    public static void main(String[] args) {

        // Buat objek MesinTarif dengan kota "Medan"
        MesinTarif tarif = new MesinTarif("Medan");

        System.out.println("=== INI METHOD OVERLOADING ===");

        // Versi 1: hanya berat
        System.out.println("Ongkir Biasa (2.0 Kg)          : Rp " + tarif.hitungOngkir(2.0));

        // Versi 2: berat + nilai barang (untuk asuransi)
        System.out.println("Ongkir + Asuransi (Barang 5Jt) : Rp " + tarif.hitungOngkir(2.0, 5000000.0));

        // Versi 3: berat + status express (true = express)
        System.out.println("Ongkir Express (2.0 Kg)        : Rp " + tarif.hitungOngkir(2.0, true));
    }
}

/*
Jawab:
1. Mengapa compiler Java dapat menentukan method hitungOngkir mana yang dijalankan
sebelum program dieksekusi (compile-time)? Bagian method apa yang diperiksa compiler?

Jawab : 
  Compiler memakai static binding. Ia mencocokkan argumen pemanggilan dengan
signature method, yaitu nama, jumlah, tipe, dan urutan parameter.

2. Jika pada class MesinTarif ditambahkan method berikut:
public int hitungOngkir(double beratKg) {
return (int)(beratKg * 10000);
}
Mengapa compiler menolak kode tersebut padahal tipe kembaliannya berbeda (int vs double)?

Jawab : 

Ditolak karena return type tidak termasuk signature. Signature-nya sama
(hitungOngkir(double)), jadi dianggap duplikat dan compiler tidak bisa
menentukan mana yang dipanggil.
*/