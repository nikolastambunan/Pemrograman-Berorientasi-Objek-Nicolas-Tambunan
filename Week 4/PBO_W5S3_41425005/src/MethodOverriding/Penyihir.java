/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MethodOverriding;

/**
 *
 * @author Nikolas
 */
class Penyihir {
    public void ucapkanMantra() {
        System.out.println("Mengucapkan mantra dengan cara biasa.");
    }
}

class HarryPotter extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Harry Potter mengucapkan mantra dengan tongkatnya yang unik.");
    }
}

class Hermione extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Hermione mengucapkan mantra dengan tepat dan percaya diri.");
    }
}

/*
Soal 1:
Apa yang terjadi jika kita tidak menggunakan annotation @Override? Apakah kode masih berjalan?

Jawaban:
Kode tetap berjalan dan outputnya sama, karena @Override bersifat opsional.
Fungsinya hanya sebagai pengaman: compiler akan memberi error jika
method yang ditulis ternyata tidak benar-benar meng-override method
di superclass (misalnya salah ketik nama method).
Tanpa @Override, kesalahan itu tidak terdeteksi dan Java menganggapnya
sebagai method baru.


Soal 2:
Apa keuntungan menggunakan polymorphism dalam contoh ini?

Jawaban:
1. Satu tipe (Penyihir) bisa dipakai untuk berbagai objek
   (HarryPotter, Hermione) dengan pemanggilan method yang sama.
2. Mudah dikembangkan, karena penyihir baru cukup dibuat sebagai
   subclass tanpa mengubah kode yang sudah ada.
3. Kode lebih singkat dan tidak perlu banyak if-else untuk
   mengecek jenis penyihir.
*/