/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan2;

/**
 *
 * @author Nikolas
 */
public class Main {
    public static void main(String[] args) {
        
        // Menggunakan Polimorfisme (Referensi Interface, Objek Kelas Anak)
        Kendaraan kendaraan1 = new Mobil();
        Kendaraan kendaraan2 = new Motor();
        
        System.out.println("=== Menguji Kendaraan 1 ===");
        kendaraan1.gas();
        kendaraan1.rem();
        
        System.out.println("\n=== Menguji Kendaraan 2 ===");
        kendaraan2.gas();
        kendaraan2.rem();
    }
}
