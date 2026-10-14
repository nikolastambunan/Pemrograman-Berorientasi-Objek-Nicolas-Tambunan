
import java.util.Scanner;


public class LoginSederhana {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menerima input username dan password
        System.out.print("Masukkan username: ");
        String username = input.nextLine();
        System.out.print("Masukkan password: ");
        String password = input.nextLine();

        // Validasi username harus "admin"
        boolean usernameValid = username.equals("admin");

        // Validasi password minimal 6 karakter dan mengandung angka
        boolean panjangValid = password.length() >= 6;
        boolean adaAngka = password.matches(".*[0-9].*");

        // Menentukan hasil login
        if (usernameValid && panjangValid && adaAngka) {
            System.out.println("Login berhasil!");
        } else if (!usernameValid) {
            System.out.println("Login gagal! Username tidak valid.");
        } else {
            System.out.println("Login gagal! Password tidak valid.");
        }
    }
}
//Nama : Nicolas adrian partuaon Tambunan
//Nim  : 41425005
//Prodi : Strpl-1