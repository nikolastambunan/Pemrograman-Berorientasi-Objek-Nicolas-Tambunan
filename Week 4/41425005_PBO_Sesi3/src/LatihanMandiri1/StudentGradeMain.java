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

/**
 *
 * @author Nikolas
 */
// Class utama untuk menjalankan dan menguji class StudentGrade
public class StudentGradeMain {
    public static void main(String[] args) {
        // Membuat objek mahasiswa baru, nilai awal kuis dan UTS adalah 0
        StudentGrade mhs = new StudentGrade("11425001", "Marsha");

        // Nilai 110 ditolak karena di luar rentang 0-100, nilai kuis tetap 0
        mhs.setNilaiKuis(110.0);

        // Nilai valid, kuis diubah menjadi 85
        mhs.setNilaiKuis(85.0);

        // Nilai valid, UTS diubah menjadi 90
        mhs.setNilaiUTS(90.0);

        // Mencetak laporan: nilai akhir (0.4 x 85) + (0.6 x 90) = 88.0, grade A
        mhs.cetakLaporan();
    }
}