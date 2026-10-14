// Nama  : Nicolas Adrian Partuaon Tambunan
// NIM   : 41425005
// Prodi : STRPL-1

// Mengimpor Scanner untuk membaca input dari keyboard
import java.util.Scanner;

// Membuat class dengan nama KonversiSuhu
public class KonversiSuhu {

    // Method utama yang pertama kali dijalankan
    public static void main(String[] args) {

        // Membuat objek Scanner untuk menerima input dari user
        Scanner input = new Scanner(System.in);

        // Meminta user memasukkan suhu dalam Celsius
        System.out.print("Masukkan suhu dalam Celsius: ");

        // Membaca suhu Celsius dalam bentuk double
        double celsius = input.nextDouble();

        // Mengubah suhu Celsius menjadi Fahrenheit
        // Rumus: Fahrenheit = (Celsius × 9/5) + 32
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Menampilkan hasil konversi Celsius ke Fahrenheit
        System.out.println(celsius + " C = " + fahrenheit + " F");


        // Meminta user memasukkan suhu dalam Fahrenheit
        System.out.print("Masukkan suhu dalam Fahrenheit: ");

        // Membaca suhu Fahrenheit dalam bentuk double
        double fahrenheit2 = input.nextDouble();

        // Mengubah suhu Fahrenheit menjadi Celsius
        // Rumus: Celsius = (Fahrenheit - 32) × 5/9
        double celsius2 = (fahrenheit2 - 32) * 5 / 9;

        // Menampilkan hasil konversi dengan 1 angka di Fahrenheit
        // dan 2 angka di belakang koma untuk Celsius
        System.out.printf("%.1f F = %.2f C%n", fahrenheit2, celsius2);
    }
}