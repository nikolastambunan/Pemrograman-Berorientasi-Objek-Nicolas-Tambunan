/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tantangan;

import java.util.ArrayList;
import java.util.List;





/**
 *
 * @author Nikolas
 */

// 1. Abstract class dengan method abstrak aktifkan() dan nonaktifkan()
abstract class MantraPerlindungan {
    public abstract void aktifkan();
    public abstract void nonaktifkan();
}




// 2. Kelas konkret yang mewarisi MantraPerlindungan
class Protego extends MantraPerlindungan {
    @Override
    public void aktifkan() {
        System.out.println("Perisai Protego terbentuk!");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Perisai Protego menghilang.");
    }
}



class Fidelius extends MantraPerlindungan {
    private String secretKeeper;

    public Fidelius(String secretKeeper) {
        this.secretKeeper = secretKeeper;
    }

    @Override
    public void aktifkan() {
        System.out.println("Fidelius aktif: " + secretKeeper + " menjadi secret keeper.");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Fidelius nonaktif: " + secretKeeper + " bukan lagi secret keeper.");
    }
}




class MantraAntiApparition extends MantraPerlindungan {
    private String area;

    public MantraAntiApparition(String area) {
        this.area = area;
    }

    @Override
    public void aktifkan() {
        System.out.println("Anti-Apparition aktif: apparition dicegah di " + area + ".");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Anti-Apparition nonaktif: apparition kembali diizinkan di " + area + ".");
    }
}




// 3. Kelas SistemPertahanan yang menampung banyak mantra perlindungan
class SistemPertahanan {
    private List<MantraPerlindungan> daftarMantra = new ArrayList<>();

    public void tambahMantra(MantraPerlindungan mantra) {
        daftarMantra.add(mantra);
    }

    public void aktifkanSemuaMantra() {
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.aktifkan();
        }
    }

    public void nonaktifkanSemuaMantra() {
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.nonaktifkan();
        }
    }
}

// 4. Demonstrasi sistem pertahanan Hogwarts
public class SistemPertahananHogwarts {
    public static void main(String[] args) {
        SistemPertahanan hogwarts = new SistemPertahanan();

        hogwarts.tambahMantra(new Protego());
        hogwarts.tambahMantra(new Fidelius("Severus Snape"));
        hogwarts.tambahMantra(new MantraAntiApparition("Hogwarts"));

        System.out.println("=== Mengaktifkan semua mantra ===");
        hogwarts.aktifkanSemuaMantra();

        System.out.println();
        System.out.println("=== Menonaktifkan semua mantra ===");
        hogwarts.nonaktifkanSemuaMantra();
    }
}