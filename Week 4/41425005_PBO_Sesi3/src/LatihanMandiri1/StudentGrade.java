/*
Nama : Nicolas Adrian Partuaon Tambunan
Nim  : 41425005
Prodi  : DIV TRpl 25
*/



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanMandiri1;

public class StudentGrade {

    /*
     * ATRIBUT
     * Semua atribut private sehingga tidak bisa diubah langsung dari luar
     * class (enkapsulasi). nim dan nama bersifat final karena identitas
     * mahasiswa tidak boleh berubah setelah objek dibuat. Nilai kuis, nilai
     * UTS, dan grade huruf boleh berubah.
     */
    private final String nim;
    private final String nama;
    private double nilaiKuis;
    private double nilaiUTS;
    private String gradeHuruf;

    /*
     * CONSTRUCTOR
     * Dijalankan saat objek dibuat, misalnya new StudentGrade("123", "Budi").
     * Mengisi NIM dan nama, mengatur nilai awal kuis dan UTS menjadi 0, lalu
     * memanggil hitungGradeHuruf() supaya gradeHuruf tidak kosong (null).
     * Terakhir mencetak pesan registrasi.
     */
    public StudentGrade(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiKuis = 0.0;
        this.nilaiUTS = 0.0;
        hitungGradeHuruf();
        System.out.println("[Registrasi] Berhasil mendaftarkan mahasiswa: " + nim + " - " + nama);
    }

    /*
     * GETTER
     * Dipakai untuk membaca nilai atribut private dari luar class.
     * NIM dan nama hanya punya getter, tanpa setter, karena bersifat final.
     */
    public String getNim()        { return nim; }
    public String getNama()       { return nama; }
    public double getNilaiKuis()  { return nilaiKuis; }
    public double getNilaiUTS()   { return nilaiUTS; }
    public String getGradeHuruf() { return gradeHuruf; }

    /*
     * SETTER NILAI KUIS (dengan validasi)
     * Alur kerja:
     * 1. Cek apakah nilai berada di rentang 0 sampai 100.
     * 2. Jika tidak valid, tampilkan pesan error lalu return, sehingga nilai
     */
    public void setNilaiKuis(double nilai) {
        if (nilai < 0.0 || nilai > 100.0) {
            System.out.println("[Error] Nilai kuis tidak valid: " + nilai + " (Harus antara 0 - 100)");
            return;
        }
        this.nilaiKuis = nilai;
        System.out.println("[Update] Nilai kuis berhasil diubah menjadi: " + nilai);
        hitungGradeHuruf();
    }

    /*
     * SETTER NILAI UTS (dengan validasi)
     * Alurnya sama persis dengan setNilaiKuis(): validasi rentang 0 sampai
     * 100, simpan nilai jika valid, lalu perbarui grade.
     */
    public void setNilaiUTS(double nilai) {
        if (nilai < 0.0 || nilai > 100.0) {
            System.out.println("[Error] Nilai UTS tidak valid: " + nilai + " (Harus antara 0 - 100)");
            return;
        }
        this.nilaiUTS = nilai;
        System.out.println("[Update] Nilai UTS berhasil diubah menjadi: " + nilai);
        hitungGradeHuruf();
    }

    /*
     * HITUNG NILAI AKHIR
     * Rumus: nilai akhir = (0.4 x kuis) + (0.6 x UTS), artinya kuis berbobot
     * 40 persen dan UTS 60 persen.
     * Contoh: kuis 80 dan UTS 90 menghasilkan 32 + 54 = 86.
     */
    public double hitungNilaiAkhir() {
        return (0.4 * nilaiKuis) + (0.6 * nilaiUTS);
    }

    /*
     * HITUNG GRADE HURUF
     * Method private karena hanya dipakai di dalam class ini.
     * Pengecekan dilakukan dari batas tertinggi ke terendah memakai else if,
     * sehingga hanya satu kondisi yang dijalankan.
     *
     * Nilai akhir 80 ke atas              : A
     * Nilai akhir 70 sampai kurang dari 80 : B
     * Nilai akhir 60 sampai kurang dari 70 : C
     * Nilai akhir 50 sampai kurang dari 60 : D
     * Nilai akhir di bawah 50              : E
     */
    private void hitungGradeHuruf() {
        double akhir = hitungNilaiAkhir();
        if (akhir >= 80)      gradeHuruf = "A";
        else if (akhir >= 70) gradeHuruf = "B";
        else if (akhir >= 60) gradeHuruf = "C";
        else if (akhir >= 50) gradeHuruf = "D";
        else                  gradeHuruf = "E";
    }

    /*
     * CETAK LAPORAN
     * Menampilkan kartu hasil studi ke layar: NIM, nama, nilai kuis,
     * nilai UTS, nilai akhir, dan grade.
     */
    public void cetakLaporan() {
        System.out.println("=== KARTU HASIL STUDI ===");
        System.out.println("NIM        : " + nim);
        System.out.println("Nama       : " + nama);
        System.out.println("Nilai Kuis : " + nilaiKuis);
        System.out.println("Nilai UTS  : " + nilaiUTS);
        System.out.println("Nilai Akhir: " + hitungNilaiAkhir());
        System.out.println("Grade      : " + gradeHuruf);
    }
}