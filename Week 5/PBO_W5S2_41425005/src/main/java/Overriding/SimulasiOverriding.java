/*
Nama : Nicolas Adrian Partuaon Tambunan
Nim  : 41425005
prodi  : DIV Trpl
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package   Overriding;

/**
 *
 * @author Nikolas
 */
public class SimulasiOverriding {
    public static void main(String[] args) {
        System.out.println("=== INI METHOD OVERRIDING ===");

        // Variabel bertipe KurirReguler, objek aslinya KurirReguler
        KurirReguler k1 = new KurirReguler("Budi");

        // Variabel bertipe KurirReguler, tapi objek aslinya KurirDrone
        // (boleh, karena KurirDrone adalah turunan KurirReguler)
        KurirReguler k2 = new KurirDrone("Arka", "DRN-01");

        // Objek asli KurirReguler -> jalankan kirimBarang versi KurirReguler
        k1.kirimBarang("Jl. Sudirman No. 10");

        // Objek asli KurirDrone -> jalankan kirimBarang versi KurirDrone
        // (Java melihat objek aslinya saat program berjalan)
        k2.kirimBarang("Gedung Graha Lt. 5");

        // k2.idDrone; -> ERROR, karena variabel k2 bertipe KurirReguler
        // sehingga hanya bisa mengakses anggota milik KurirReguler
    }
}

/*
Soal 1: Hapus @Override di KurirDrone dan ubah nama method menjadi kirimbarang
(b kecil). Apa output dari k2.kirimBarang("Gedung Graha Lt. 5")? Apakah masih
"lewat jalur udara" atau berubah menjadi "lewat jalur darat"?


Jawab:
Berubah menjadi jalur darat. Outputnya:
Arka mengantar paket ke Gedung Graha Lt. 5 lewat jalur darat menembus kemacetan.
Karena  Membuat dianggap method baru (bukan override), sehingga yang
dipanggil adalah method kirimBarang milik parent KurirReguler.

Soal 2: Kembalikan @Override di atas method yang salah ketik, lalu kompilasi
ulang. Salin pesan error yang muncul!


Jawab: method does not override or implement a method from a supertype

Soal 3: Jelaskan dengan bahasa Anda sendiri fungsi utama @Override bagi
programmer!


Jawab: 

@Override memberi tahu compiler bahwa method ini harus menimpa method
milik parent. Jika ada salah ketik nama atau parameter, compiler langsung
menampilkan error, sehingga kesalahan ketahuan saat kompilasi dan tidak
menjadi bug saat program berjalan.
*/

