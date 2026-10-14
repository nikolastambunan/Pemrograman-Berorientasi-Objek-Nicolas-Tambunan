// Nama : Nicolas Adrian Partuaon Tambunan
// Nim  : 41425005
// Kelas : STRPL-1

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java 
 */
package pkg41425005_nicolas.adrian.partuaon.tambunan_sesi3;

import java.util.Scanner;

public class CreditCardValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nomor kartu: ");
        String input = scanner.nextLine();

        String cleaned = removeHyphens(input);

        if (isValidCardNumber(cleaned)) {
            System.out.println("Nomor kartu valid.");
        } else {
            System.out.println("Nomor kartu tidak valid!");
            // Beri tahu alasan spesifik ketidakvalidan-nya
            printReason(cleaned);
        }

        scanner.close();
    }

    // Menghapus semua tanda hubung dari input, misal "4123-4567-8901-2345"
    // menjadi "4123456789012345"
    private static String removeHyphens(String input) {
        return input.replace("-", "");
    }

    private static boolean isValidCardNumber(String number) {
        if (number.length() != 16) {
            return false;
        }
        if (!number.matches("[0-9]+")) {
  
            return false;
        }
        char firstDigit = number.charAt(0);
        return firstDigit == '4' || firstDigit == '5' || firstDigit == '6';
    }
    private static void printReason(String number) {
        if (!number.matches("[0-9]+")) {
            System.out.println("Nomor kartu hanya boleh berisi angka dan tanda hubung.");
            return;
        }
        if (number.length() != 16) {
            System.out.println("Nomor kartu harus terdiri dari 16 digit.");
        }
        char firstDigit = number.charAt(0);
        if (firstDigit != '4' && firstDigit != '5' && firstDigit != '6') {
            System.out.println("Harus dimulai dengan 4, 5, atau 6.");
        }
    }
}