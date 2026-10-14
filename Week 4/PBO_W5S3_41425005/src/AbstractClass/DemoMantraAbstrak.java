/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractClass;

/**
 *
 * @author Nikolas
 */
public class DemoMantraAbstrak {
    public static void main(String[] args) {
        MantraAbstrak mantra1 = new Expelliarmus();
        MantraAbstrak mantra2 = new ExpectoPatronum();

   

        mantra2.ucapkan();
        mantra2.efek();
    }
}


/*
Soal 1:

Apa yang terjadi jika kita mencoba membuat objek dari MantraAbstrak langsung? Coba dan jelaskan errornya.

Jawaban:
Kode di bawah ini akan error saat dikompilasi (compile-time error):

MantraAbstrak mantra = new MantraAbstrak("Lumos");

Pesan errornya:
"MantraAbstrak is abstract; cannot be instantiated"

Penjelasan: abstract class belum lengkap karena punya abstract method
(efek()) yang belum ada isinya, sehingga Java melarang pembuatan
objek langsung dari class tersebut. Class ini hanya bisa dipakai
lewat subclass (Expelliarmus, ExpectoPatronum) yang mengimplementasikan
method efek().


Soal 2:
Mengapa kita perlu membuat abstract class? Apa keuntungannya?

Jawaban:
Abstract class dibuat sebagai kerangka dasar (template) untuk
class-class turunannya.

Keuntungannya:
1. Memaksa subclass mengimplementasikan method tertentu (efek()),
   sehingga setiap mantra pasti punya efek.
2. Mengurangi duplikasi kode, karena atribut (nama) dan method
   konkret (ucapkan()) cukup ditulis sekali di abstract class.
3. Mencegah pembuatan objek yang tidak masuk akal, karena "mantra"
   secara umum terlalu abstrak untuk dijadikan objek.
4. Mendukung polymorphism, karena MantraAbstrak bisa dipakai sebagai
   tipe umum untuk semua jenis mantra.
*/
