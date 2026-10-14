// Nama : Nicolas Adrian Partuaon Tambunan
// Nim  : 41425005
// Kelas : STRPL-1

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg41425005_nicolas.adrian.partuaon.tambunan_sesi3;


import java.util.Scanner;

public class ShoppingCart {

    private static final int MAX_ITEM = 100; // kapasitas maksimal array

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] items = new String[MAX_ITEM]; // array penyimpan daftar belanja
        int itemCount = 0; // jumlah item yang saat ini ada di daftar

        boolean running = true;

        while (running) {
            // ===== Tampilkan menu =====
            System.out.println("=== Daftar Belanja ===");
            System.out.println("1. Tambah item");
            System.out.println("2. Hapus item");
            System.out.println("3. Tampilkan semua item");
            System.out.println("4. Cari item");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // buang sisa newline setelah nextInt()

            switch (pilihan) {
                case 1: // Tambah item
                    if (itemCount >= MAX_ITEM) {
                        System.out.println("Daftar belanja sudah penuh!");
                        break;
                    }
                    System.out.print("Masukkan item: ");
                    String newItem = scanner.nextLine();
                    items[itemCount] = newItem; // simpan item baru di posisi terakhir
                    itemCount++; // tambah jumlah item
                    System.out.println(newItem + " berhasil ditambahkan!");
                    break;

                case 2: // Hapus item berdasarkan posisi
                    if (itemCount == 0) {
                        System.out.println("Daftar belanja masih kosong!");
                        break;
                    }
                    System.out.print("Hapus item pada posisi: ");
                    int posHapus = scanner.nextInt();
                    scanner.nextLine();

                    if (posHapus < 1 || posHapus > itemCount) {
                        System.out.println("Posisi tidak valid!");
                    } else {
                        String removedItem = items[posHapus - 1];
                        // Geser semua item setelah posisi yang dihapus ke kiri satu langkah
                        for (int i = posHapus - 1; i < itemCount - 1; i++) {
                            items[i] = items[i + 1];
                        }
                        items[itemCount - 1] = null; // kosongkan slot terakhir
                        itemCount--; // kurangi jumlah item
                        System.out.println(removedItem + " berhasil dihapus!");
                    }
                    break;

                case 3: // Tampilkan semua item
                    System.out.println("Daftar belanja:");
                    if (itemCount == 0) {
                        System.out.println("(kosong)");
                    } else {
                        for (int i = 0; i < itemCount; i++) {
                            System.out.println((i + 1) + ". " + items[i]);
                        }
                    }
                    break;

                case 4: // Cari item
                    System.out.print("Cari item: ");
                    String keyword = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < itemCount; i++) {
                        if (items[i].equalsIgnoreCase(keyword)) {
                            System.out.println(items[i] + " ditemukan pada posisi " + (i + 1));
                            found = true;
                            break; // hentikan pencarian setelah ditemukan
                        }
                    }
                    if (!found) {
                        System.out.println(keyword + " tidak ditemukan dalam daftar.");
                    }
                    break;

                case 5: // Keluar dari program
                    System.out.println("Terima kasih!");
                    running = false; // hentikan loop utama
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
            System.out.println(); // baris kosong pemisah antar menu
        }

        scanner.close();
    }
}