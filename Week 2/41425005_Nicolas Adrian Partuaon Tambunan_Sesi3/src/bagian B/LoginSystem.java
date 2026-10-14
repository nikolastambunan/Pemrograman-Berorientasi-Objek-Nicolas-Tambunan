// Nama : Nicolas Adrian Partuaon Tambunan
// Nim  : 41425005
// Kelas : STRPL-1

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg41425005_nicolas.adrian.partuaon.tambunan_sesi3;


import java.util.Scanner;

public class LoginSystem {

    // Akun yang valid disimpan sebagai "database" sederhana
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "password123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAttempt = 3;
        boolean loginSuccess = false;

        System.out.println("=== Sistem Login ===");

        for (int attempt = 1; attempt <= maxAttempt; attempt++) {
            System.out.println("Percobaan " + attempt + ":");

            System.out.print("Username: ");
            String username = scanner.nextLine();

            System.out.print("Password: ");
            String password = scanner.nextLine();

            // ===== Validasi format username (5-10 karakter) =====
            if (username.length() < 5 || username.length() > 10) {
                System.out.println("Login gagal! Username harus antara 5-10 karakter.");
                continue; // lanjut ke percobaan berikutnya
            }

            // ===== Validasi format password (min 8 karakter & mengandung angka) =====
            if (!isPasswordValid(password)) {
                System.out.println("Login gagal! Password harus minimal 8 karakter dan mengandung angka.");
                continue;
            }

            // ===== Cek kecocokan kredensial =====
            if (username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD)) {
                System.out.println("Login berhasil!");
                loginSuccess = true;
                break; // keluar dari loop karena sudah berhasil
            } else if (username.equals(VALID_USERNAME)) {
                System.out.println("Login gagal! Password salah.");
            } else {
                System.out.println("Login gagal! Username tidak ditemukan.");
            }
        }

        // Jika sampai akhir loop belum berhasil login -> akun terkunci
        if (!loginSuccess) {
            System.out.println("Akun terkunci! Terlalu banyak percobaan gagal.");
        }

        scanner.close();
    }

    // Method bantu untuk memeriksa apakah password valid:
    // minimal 8 karakter dan mengandung setidaknya satu digit angka
    private static boolean isPasswordValid(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
        return hasDigit;
    }
}
