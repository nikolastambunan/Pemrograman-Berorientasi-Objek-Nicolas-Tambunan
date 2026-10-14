/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KombinasiPolymorphismdanAbstractClass;

/**
 *
 * @author Nikolas
 */
import java.util.*;
import java.util.ArrayList;
import java.util.List;

abstract class Mantra {
    private String nama;

    public Mantra(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Abstract method untuk efeh mantro
    public abstract void efek();
}

class Expelliarmus extends Mantra {
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Melucuti senjata lawan!");
    }
}

class ExpectoPatronum extends Mantra {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Memanggil Patronus!");
    }
}

class Lumos extends Mantra {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Menerangi ujung tongkat!");
    }
}

class Penyihir {
    private String nama;
    private List<Mantra> mantralist;

    public Penyihir (String nama) {
        this.nama = nama;
        this.mantralist = new ArrayList<>();
    }

    public void belajarMantra (Mantra mantra) {
        mantralist.add(mantra);
        System.out.println(nama + " belajar mantra: " + mantra.getNama());
    }

    public void ucapkanMantra (String namaMantra) {
        for (Mantra mantra : mantralist) {
            if (mantra.getNama().equals(namaMantra)) {
                System.out.println(nama + " mengucapkan: " + mantra.getNama());
                mantra.efek();
                return;
            }
        }
        System.out.println(nama + " belum belajar mantra " + namaMantra);
    }
}

/*
Soal 1:
Bagaimana polymorphism dan abstract class bekerja sama dalam contoh ini?

Jawaban:
Abstract class Mantra menjadi tipe umum yang punya abstract method
efek(). Setiap subclass (Expelliarmus, ExpectoPatronum, Lumos)
wajib mengimplementasikan efek() dengan caranya sendiri.

Class Penyihir hanya mengenal tipe Mantra, bukan mantra tertentu.
List<Mantra> bisa menampung semua jenis mantra, dan saat
mantra.efek() dipanggil, Java otomatis menjalankan versi efek()
sesuai objek aslinya (polymorphism / dynamic binding).


Soal 2:
Apa yang akan terjadi jika kita menambahkan mantra baru tanpa
mengubah kelas Penyihir? Apakah mudah? Mengapa?

Jawaban:
Mudah dan program tetap berjalan normal. Cukup buat subclass baru
dari Mantra, misalnya:






class Stupefy extends Mantra {
    public Stupefy() {
        super("Stupefy");
    }

    @Override
    public void efek() {
        System.out.println("Membuat lawan pingsan!");
    }
}






Lalu pakai: harry.belajarMantra(new Stupefy());

Alasannya:
1. Penyihir bergantung pada tipe abstrak Mantra, bukan pada mantra
   tertentu, sehingga tidak perlu diubah.
2. Abstract class memastikan mantra baru pasti punya getNama() dan
   efek(), jadi cocok dengan cara kerja Penyihir.
3. Kode lama tidak tersentuh, sehingga risiko error lebih kecil.
*/

