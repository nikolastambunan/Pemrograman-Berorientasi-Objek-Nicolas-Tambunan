// Nama : Nicolas Adrian Partuaon Tambunan
// Nim  : 41425005
// Kelas : STRPL-1

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg41425005_nicolas.adrian.partuaon.tambunan_sesi3;


import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Konverter Waktu ===");
        System.out.println("1. Detik ke HH:MM:SS");
        System.out.println("2. HH:MM:SS ke detik");
        System.out.print("Pilihan: ");
        int pilihan = scanner.nextInt();

        if (pilihan == 1) {
            // ===== Konversi detik -> HH:MM:SS =====
            System.out.print("Masukkan jumlah detik: ");
            int totalSeconds = scanner.nextInt();

            int hours = totalSeconds / 3600; // jumlah jam penuh
            int minutes = (totalSeconds % 3600) / 60; // sisa dibagi 60 untuk menit
            int seconds = totalSeconds % 60; // sisa detik

            // format dua digit menggunakan String.format
            System.out.printf("Hasil: %02d:%02d:%02d%n", hours, minutes, seconds);

        } else if (pilihan == 2) {
            // ===== Konversi HH:MM:SS -> total detik =====
            System.out.print("Masukkan waktu (HH:MM:SS): ");
            String waktu = scanner.next();

            // pisahkan string berdasarkan tanda ":"
            String[] parts = waktu.split(":");
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);
            int seconds = Integer.parseInt(parts[2]);

            int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
            System.out.println("Hasil: " + totalSeconds + " detik");

        } else {
            System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }
}
