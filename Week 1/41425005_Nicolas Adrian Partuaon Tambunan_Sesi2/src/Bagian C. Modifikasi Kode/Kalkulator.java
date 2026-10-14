import java.util.Scanner; // import Scanner untuk membaca input dari user

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // objek Scanner untuk membaca input

        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();
     
        // Operasi aritmatika dasar
        System.out.println("Tambah: " + (a + b));
        System.out.println("Kurang: " + (a - b));
        System.out.println("Kali: " + (a * b));
        System.out.println("Bagi: " + ((double) a / b));

        // --- Fitur tambahan: Modulus (sisa bagi) ---
        System.out.println("Modulus: " + (a % b));

        // --- Fitur tambahan: Perpangkatan ---
        int pangkat = (int) Math.pow(a, b);
        System.out.println("Pangkat: " + pangkat);
    }
}