/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOAL2;

/**
 *
 * @author Nikolas
 */
class Mahasiswa {
    String nama;
    String nim;
}

class MahasiswaAktif extends Mahasiswa {
    int semester;

    void belajar() {
        System.out.println(nama + " sedang belajar di semester " + semester);
    }
}

public class Main {
    public static void main(String[] args) {
        MahasiswaAktif m = new MahasiswaAktif();
        
        // Isi data objek MahasiswaAktif
        m.nama = "Nicolas Tambunan";
        m.nim = "41425005";
        m.semester = 5;

        // Tampilkan output
        System.out.println("Nama: " + m.nama);
        System.out.println("NIM: " + m.nim);
        m.belajar();
    }
}