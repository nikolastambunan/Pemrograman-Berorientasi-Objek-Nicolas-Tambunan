// Mengimpor class Scanner dari pustaka bawaan Java agar program bisa menerima input dari keyboard
import java.util.Scanner;

// Mendefinisikan class utama bernama DataDiri (nama class harus sesuai dengan nama file DataDiri.java)
public class DataDiri {

    // Titik awal eksekusi program (main method) yang dijalankan pertama kali oleh JVM
    public static void main(String[] args) {

        // Membuat objek Scanner bernama 'input' yang membaca aliran data dari keyboard (System.in)
        Scanner input = new Scanner(System.in);

        // Menampilkan teks instruksi tanpa baris baru agar user mengetik di baris yang sama
        System.out.print("Masukkan nama: ");
        // Membaca seluruh teks dalam satu baris (termasuk spasi) dan menyimpannya ke variabel bertipe String
        String nama = input.nextLine();

        // Meminta user menginputkan umur
        System.out.print("Masukkan umur: ");
        // Membaca token bilangan bulat (integer) dari input user
        int umur = input.nextInt();

        // Meminta user menginputkan tinggi badan
        System.out.print("Masukkan tinggi badan (cm): ");
        // Membaca token bilangan desimal (pecahan presisi ganda) dari input user
        double tinggi = input.nextDouble();
        
        // Membersihkan karakter newline (\n) yang tertinggal di buffer setelah method nextDouble()
        // Ini mencegah pembacaan input berikutnya terlewati jika ada pemanggilan nextLine() lagi
        input.nextLine();

        // Meminta user menginputkan nilai kebenaran status mahasiswa
        System.out.print("Apakah Anda mahasiswa? (true/false): ");
        // Membaca nilai logika (hanya menerima kata "true" atau "false")
        boolean isMahasiswa = input.nextBoolean();

        // Mencetak data nama yang telah digabungkan (string concatenation) dengan label teks
        System.out.println("Nama: " + nama);
        // Mencetak umur diikuti satuan tahun, lalu otomatis berpindah ke baris baru (println)
        System.out.println("Umur: " + umur + " tahun");
        // Mencetak tinggi badan dalam bentuk desimal
        System.out.println("Tinggi: " + tinggi + " cm");
        // Mencetak nilai boolean (true atau false)
        System.out.println("Status Mahasiswa: " + isMahasiswa);

        // Explicit type casting: memotong angka di belakang koma dari variabel 'tinggi' (double) menjadi bilangan bulat (int)
        int tinggiBulat = (int) tinggi;
        // Mencetak hasil konversi tinggi badan yang sudah dibulatkan ke bawah
        System.out.println("Tinggi (dibulatkan): " + tinggiBulat + " cm");
        
        // Menutup objek Scanner untuk melepaskan resource sistem (opsional tetapi praktik yang baik)
        input.close();
    }
}