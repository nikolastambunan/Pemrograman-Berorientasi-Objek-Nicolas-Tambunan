
import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14;

        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();

        if (r < 0) {
            System.out.println("Error: jari-jari tidak boleh negatif.");
        } else {
            double luas = PI * r * r;
            double keliling = 2 * PI * r;
            System.out.println("Luas: " + luas);
            System.out.println("Keliling: " + keliling);
        }
    }
}

//Nama : Nicolas adrian partuaon Tambunan
//Nim  : 41425005
//Prodi : Strpl-1


// Pertanyaan Pemantik:
// 1. Mengapa perlu validasi r < 0?
//    Jawaban: Jari-jari tidak mungkin negatif secara logika, jika tidak
//    divalidasi hasil luas/keliling jadi tidak masuk akal.
//
// 2. Di mana validasi input penting dalam aplikasi nyata?
//    Jawaban: Misalnya input nominal transfer bank, umur pendaftar,
//    jumlah barang belanja, dan password login.