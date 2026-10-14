

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        System.out.println("Tambah: " + (a + b));
        System.out.println("Kurang: " + (a - b));
        System.out.println("Kali: " + (a * b));
        System.out.println("Bagi: " + ((double) a / b));
    }
}


//Nama : Nicolas adrian partuaon Tambunan
//Nim  : 41425005
//Prodi : Strpl-1


//Pertanyaan pemantik :
// 1. Apa perbedaan nilai asli double dengan hasil casting int?
//    Jawaban: Nilai asli double (165.8) masih menyimpan bagian desimalnya secara utuh,
//    sedangkan hasil casting ke int (165) akan membuang (truncate) bagian desimal
//    tanpa pembulatan matematis. Jadi 165.8 setelah di-cast ke int menjadi 165,
//    bukan 166, karena casting int hanya memotong angka setelah koma.

// 2.  Mengapa pembagian int perlu di-casting ke double?
//    Jawaban: Karena pembagian antar tipe int di Java menghasilkan int juga,
//    sehingga bagian desimal hasil bagi akan hilang (dibulatkan ke bawah).
//    Casting salah satu operand ke double memaksa Java melakukan pembagian
//    secara desimal agar hasilnya lebih akurat, contoh (double) a / b.
//
// 3.  Apa risiko jika pembagi = 0?
//    Jawaban: Jika tipe data int dibagi 0, program akan menghasilkan error
//    ArithmeticException: