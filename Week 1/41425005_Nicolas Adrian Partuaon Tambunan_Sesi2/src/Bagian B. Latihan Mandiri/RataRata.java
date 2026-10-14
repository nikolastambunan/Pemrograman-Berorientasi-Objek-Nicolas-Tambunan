
import java.util.Scanner;


public class RataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menerima 3 input nilai ujian
        System.out.print("Masukkan nilai 1: ");
        double nilai1 = input.nextDouble();
        System.out.print("Masukkan nilai 2: ");
        double nilai2 = input.nextDouble();
        System.out.print("Masukkan nilai 3: ");
        double nilai3 = input.nextDouble();

        double rataRata = (nilai1 + nilai2 + nilai3) / 3;
        System.out.printf("Rata-rata: %.2f%n", rataRata);
    }
}

//Nama : Nicolas adrian partuaon Tambunan
//Nim  : 41425005
//Prodi : Strpl-1