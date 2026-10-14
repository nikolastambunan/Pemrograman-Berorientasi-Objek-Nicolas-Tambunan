import java.util.Scanner;

public class SisaBagiPangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        int sisaBagi = a % b;

    
        int pangkat = (int) Math.pow(a, b);
        System.out.println("Sisa bagi: " + sisaBagi);
        System.out.println("Pangkat: " + pangkat);
    }
}

//Nama : Nicolas adrian partuaon Tambunan
//Nim  : 41425005
//Prodi : Strpl-1
