
import java.util.Scanner;



public class GanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menerima input bilangan
        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();

        // Mengecek ganjil/genap menggunakan sisa bagi 2
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan Genap");
        } else {
            System.out.println(bilangan + " adalah bilangan Ganjil");
        }
    }
}
//Nama : Nicolas adrian partuaon Tambunan
//Nim  : 41425005
//Prodi : Strpl-1