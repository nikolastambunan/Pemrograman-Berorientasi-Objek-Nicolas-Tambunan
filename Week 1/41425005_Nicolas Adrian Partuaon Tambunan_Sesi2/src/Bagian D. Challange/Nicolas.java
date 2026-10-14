import java.util.Scanner; // import Scanner untuk membaca input dari user

public class Nicolas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // objek Scanner untuk membaca input

        // Membaca kata yang akan dicek dari user
        System.out.print("Masukkan kata: ");
        String kata = input.nextLine();

        // Mengubah kata menjadi huruf kecil semua agar pengecekan
        // tidak terpengaruh oleh huruf besar/kecil
        String kataLower = kata.toLowerCase();

        // --- Bagian 1: Cek Palindrome ---
        // Membalik string menggunakan StringBuilder
        String kataTerbalik = new StringBuilder(kataLower).reverse().toString();

        // Kata dikatakan palindrome jika sama dengan hasil pembalikannya
        boolean isPalindrome = kataLower.equals(kataTerbalik);

        // --- Bagian 2: Hitung Jumlah Huruf Vokal ---
        int jumlahVokal = 0;
        for (int i = 0; i < kataLower.length(); i++) {
            char huruf = kataLower.charAt(i);
            // Mengecek apakah karakter merupakan salah satu huruf vokal
            if (huruf == 'a' || huruf == 'i' || huruf == 'u' ||
                huruf == 'e' || huruf == 'o') {
                jumlahVokal++;
            }
        }

        // Menampilkan hasil pengecekan palindrome
        if (isPalindrome) {
            System.out.println("\"" + kata + "\" adalah PALINDROME");
        } else {
            System.out.println("\"" + kata + "\" BUKAN palindrome");
        }

        // Menampilkan jumlah huruf vokal yang ditemukan
        System.out.println("Jumlah huruf vokal: " + jumlahVokal);
    }
}