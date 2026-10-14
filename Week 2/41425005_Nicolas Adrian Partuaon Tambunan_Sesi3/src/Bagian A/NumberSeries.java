// Nama : Nicolas Adrian Partuaon Tambunan
// Nim  : 41425005
// Kelas : STRPL-1


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg41425005_nicolas.adrian.partuaon.tambunan_sesi3;

// Import Scanner untuk membaca input dari keyboard
import java.util.Scanner;

public class NumberSeries {

    public static void main(String[] args) {

        // Objek untuk membaca input pengguna
        Scanner scanner = new Scanner(System.in);

  
        // Suku berikutnya = jumlah dari 2 suku sebelumnya (0, 1, 1, 2, 3, 5, ...)

        System.out.print("Masukkan jumlah deret Fibonacci: ");
        int n = scanner.nextInt(); // jumlah suku yang mau dicetak

        System.out.println("Deret Fibonacci:");

        int a = 0, b = 1; // 2 suku awal

        for (int i = 0; i < n; i++) {
            System.out.print(a + " "); // cetak suku sekarang

            int next = a + b; // hitung suku berikutnya

            // geser nilai untuk putaran selanjutnya
            a = b;
            b = next;
        }
        System.out.println();

        // ================= BAGIAN 2: CEK BILANGAN PRIMA =================
        // Prima = bilangan > 1 yang hanya bisa dibagi 1 dan dirinya sendiri

        System.out.print("Masukkan bilangan untuk dicek prima: ");
        int num = scanner.nextInt();

        boolean isPrime = true; // asumsi awal: prima

        if (num <= 1) {
            isPrime = false; // 0, 1, dan negatif bukan prima
        } else {
            // cukup cek pembagi sampai akar kuadrat num (lebih efisien)
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false; // ada pembagi lain -> bukan prima
                    break; // langsung berhenti, tidak perlu lanjut
                }
            }
        }

        System.out.println(num + (isPrime ? " adalah bilangan prima" : " bukan bilangan prima"));

        scanner.close(); // tutup scanner setelah selesai dipakai
    }
}

//Pertanyaan Pemantik :
//- Bagaimana cara mengoptimalkan algoritma Fibonacci untuk jumlah yang besar?
// Jawab : Pendekatan iteratif (seperti di program ini) sudah cukup baik, O(n).
//         Hindari rekursi biasa karena O(2^n) dan lambat. Untuk n sangat besar,
//         gunakan BigInteger (agar tidak overflow) atau teknik matrix
//         exponentiation yang kompleksitasnya O(log n).