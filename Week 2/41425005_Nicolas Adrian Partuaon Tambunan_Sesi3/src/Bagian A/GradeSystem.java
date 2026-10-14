// Nama : Nicolas Adrian Partuaon Tambunan
// Nim  : 41425005
// Kelas : STRPL-1


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg41425005_nicolas.adrian.partuaon.tambunan_sesi3;

import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array untuk menyimpan 5 nilai mahasiswa
        double[] grades = new double[5];
        double total = 0; // menampung total nilai untuk hitung rata-rata

        // ===== Input nilai =====
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            total += grades[i]; // akumulasi total nilai
        }
        double average = total / 5;
        System.out.println("Rata-rata nilai: " + average);

        char grade;
        if (average >= 85) { grade = 'A';
        } else if (average >= 70) { grade = 'B';
        } else if (average >= 60) { grade = 'C';
        } else if (average >= 50) {grade = 'D';
        } else {
            grade = 'E';
        }
        System.out.println("Grade: " + grade);
        double max = grades[0];
        double min = grades[0];
        for (int i = 1; i < 5; i++) {
            if (grades[i] > max) {
                max = grades[i];// update jika ditemukan nilai lebih besar
            }
            if (grades[i] < min) {
                min = grades[i]; // update jika ditemukan nilai lebih kecil
            }
        }

        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);

        scanner.close();
    }
}


//Pertanyaan Pemantik :
//- Apa yang terjadi jika ada nilai yang diinput di luar rentang 0-100?
// Jawab : Nilai tetap diproses karena belum ada validasi rentang, sehingga
//         rata-rata, grade, dan nilai max/min jadi tidak akurat. Solusinya
//         tambahkan pengecekan if(nilai < 0 || nilai > 100) lalu minta input ulang.
//
//- Bagaimana cara memodifikasi program untuk menangani jumlah nilai yang dinamis?
// Jawab : Ganti array berukuran tetap (double[5]) menjadi ukuran dinamis dengan
//         menanyakan jumlah data dulu ke user, lalu buat array sesuai ukuran
//         tersebut (new double[jumlah]), atau gunakan ArrayList<Double> agar
//         ukurannya bisa bertambah otomatis tanpa perlu ditentukan di awal.