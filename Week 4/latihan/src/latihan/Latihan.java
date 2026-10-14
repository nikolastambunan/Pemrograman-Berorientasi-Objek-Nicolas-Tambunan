/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan;

/**
 *
 * @author Nikolas
 */
// 1. Kelas Induk (Superclass)
class Kendaraan {
    
    void bergerak() {
        System.out.println("Kendaraan ini bergerak.");
    }
}
// 2. Kelas Turunan (Subclass) yang melakukan Overriding
class Mobil extends Kendaraan {
    @Override
    void bergerak() {
        System.out.println("Mobil bergerak cepat dengan 4 roda.");
    }
    
    void klakson() {
        System.out.println("Telolet!");
    }
}


