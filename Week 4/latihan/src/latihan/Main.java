/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author Nikolas
 */
// 3. Kelas Utama untuk menjalankan kode
public class Main {
    public static void main(String[] args) {
        
 
        // Instansiasi Polimorfisme (Overriding)
        Kendaraan k = new Mobil();
        // Ini akan memanggil metode milik Mobil (Overridden method)
        k.bergerak(); 
        
    }
}
