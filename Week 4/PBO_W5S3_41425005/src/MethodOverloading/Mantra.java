/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MethodOverloading;

/**
 *
 * @author Nikolas
 */
public class Mantra {
    // Method ucapkan() dengan satu parameter
    public void ucapkan(String namaMantra) {
        System.out.println("Mengucapkan mantra: " + namaMantra);
    }

    // Overload: method ucapkan() dengan dua parameter
    public void ucapkan(String namaMantra, int kekuatan) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan);
        if (kekuatan > 10) {
            System.out.println("Efek: Lawan terlempar!");
        } else {
            System.out.println("Efek: Senjata terlepas.");
        }
    }

    // Overload: method ucapkan() dengan tiga parameter
    public void ucapkan(String namaMantra, int kekuatan, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan + " pada " + target);
        if (kekuatan > 10) {
            System.out.println("Efek: " + target + " terlempar!");
        } else {
            System.out.println("Efek: Senjata " + target + " terlepas.");
        }
    }

    public static void main(String[] args) {
        Mantra mantra = new Mantra();
        mantra.ucapkan("Expelliarmus");
        mantra.ucapkan("Expelliarmus", 5);
        mantra.ucapkan("Expelliarmus", 15, "Voldemort");
    }
}

/*
Soal 1:

Apa yang terjadi jika kita menghapus salah satu method overloading? Misalnya, method dengan dua parameter.

Jawaban:
Jika salah satu method overloading dihapus, misalnya method dengan dua parameter ucapkan(String namaMantra, int kekuatan), program akan error saat dikompilasi (compile-time error) pada baris mantra.ucapkan("Expelliarmus", 5); karena Java tidak menemukan method ucapkan() yang cocok dengan argumen bertipe (String, int). Pesan errornya kurang lebih: "no suitable method found for ucapkan(String,int)".

Pemanggilan lainnya, yaitu ucapkan("Expelliarmus") dengan satu parameter dan ucapkan("Expelliarmus", 15, "Voldemort") dengan tiga parameter, tetap berjalan normal karena method-nya masih ada.


Soal 2:

Bisakah kita membuat method overloading dengan urutan parameter yang berbeda? Coba buat method ucapkan(int kekuatan, String namaMantra).

Jawaban:
Bisa. Method overloading boleh dibuat dengan urutan parameter yang berbeda, karena urutan tipe parameter membuat signature method berbeda. Jadi ucapkan(String, int) dan ucapkan(int, String) dianggap dua method yang berbeda, dan Java akan memilih method yang sesuai dengan urutan tipe argumen saat dipanggil.

Method ucapkan(int kekuatan, String namaMantra):

public void ucapkan(int kekuatan, String namaMantra) {
    System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan);
    if (kekuatan > 10) {
        System.out.println("Efek: Lawan terlempar!");
    } else {
        System.out.println("Efek: Senjata terlepas.");
    }
}

Pemanggilan di main:
mantra.ucapkan(15, "Expelliarmus");

Output:
Mengucapkan mantra: Expelliarmus dengan kekuatan 15
Efek:               Lawan terlempar!
*/


