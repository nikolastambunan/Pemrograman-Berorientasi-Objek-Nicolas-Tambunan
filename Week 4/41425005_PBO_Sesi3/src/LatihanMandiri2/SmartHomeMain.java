/*
Nama : Nicolas Adrian Partuaon Tambunan
Nim  : 41425005
Prodi  : DIV TRpl 25
*/



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanMandiri2;

/**
 *
 * @author Nikolas
 */
// Class utama untuk menjalankan dan menguji SmartLamp dan SmartAC
public class SmartHomeMain {
    public static void main(String[] args) {
        // Membuat objek lampu (kecerahan 80) dan AC (suhu 22), keduanya awalnya mati
        SmartLamp lampu = new SmartLamp(80);
        SmartAC ac = new SmartAC(22);

        // Lampu dinyalakan dulu, lalu dihubungkan ke WiFi (berhasil karena sudah menyala)
        lampu.turnOn();
        lampu.connectToWifi("Rumah_Indah_5G", "192.168.1.50");

        // AC dinyalakan dulu, lalu dihubungkan ke WiFi dengan IP berbeda
        ac.turnOn();
        ac.connectToWifi("Rumah_Indah_5G", "192.168.1.51");

        // AC dimatikan
        ac.turnOff();
    }
}