/*
Nama : Nicolas Adrian Partuaon Tambunan
Nim  : 41425005
prodi  : DIV Trpl
*/


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package  Overriding;

/**
 *
 * @author Nikolas
 */
// Kelas parent
class KurirReguler {
    protected String nama; // protected: bisa diakses kelas turunan

    public KurirReguler(String nama) {
        this.nama = nama;
    }

    // Method asli: kurir mengantar lewat jalur darat
    public void kirimBarang(String alamat) {
        System.out.println(nama + " mengantar paket ke " + alamat + " lewat jalur darat menembus kemacetan.");
    }
}

// Kelas child: mewarisi KurirReguler
class KurirDrone extends KurirReguler {
    private String idDrone;

    public KurirDrone(String nama, String idDrone) {
        super(nama); // panggil constructor parent untuk mengisi nama
        this.idDrone = idDrone;
    }

    // Method overriding: menimpa kirimBarang milik parent
    // @Override memastikan nama dan parameter sama dengan method parent,
    // kalau salah ketik compiler langsung error
    @Override
    public void kirimBarang(String alamat) {
        System.out.println("Unit Drone [" + idDrone + "] operator " + nama +
                           " terbang mengantar paket langsung ke koordinat: " + alamat);
    }
}

