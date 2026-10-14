import java.util.Scanner; // import Scanner untuk membaca input dari user

public class Lingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // objek Scanner untuk membaca input
        final double PI = 3.14; // konstanta nilai PI

        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();

        // --- Validasi: jari-jari tidak boleh bernilai negatif ---
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