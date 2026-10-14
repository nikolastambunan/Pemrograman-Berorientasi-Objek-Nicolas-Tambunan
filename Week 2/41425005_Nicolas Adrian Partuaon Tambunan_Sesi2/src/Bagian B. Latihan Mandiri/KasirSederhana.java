
import java.util.Scanner;


public class KasirSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Masukkan nama barang: ");
        String namaBarang = input.nextLine();
        System.out.print("Masukkan harga barang: ");
        double harga = input.nextDouble();
        System.out.print("Masukkan jumlah beli: ");
        int jumlah = input.nextInt();

        double totalSebelumDiskon = harga * jumlah;

 
        double diskon = 0;
        if (totalSebelumDiskon >= 100000) {
            diskon = totalSebelumDiskon * 0.1;
        }
        
        double totalBayar = totalSebelumDiskon - diskon;

        System.out.println("Total sebelum diskon: " + totalSebelumDiskon);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total bayar: " + totalBayar);
    }
}
//Nama : Nicolas adrian partuaon Tambunan
//Nim  : 41425005
//Prodi : Strpl-1
