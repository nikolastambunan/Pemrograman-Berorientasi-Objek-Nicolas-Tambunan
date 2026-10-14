

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
// Switchable (turnOn, turnOff) dan Connectable (connectToWifi)
// Karena itu ketiga method tersebut wajib ditulis di class ini
public class SmartLamp implements Switchable, Connectable {
    // Kecerahan lampu (dalam persen) dan status nyala/mati, dibuat private (enkapsulasi)
    private int brightness;
    private boolean isOn;

    // Constructor: menerima kecerahan awal, lampu dalam keadaan mati saat dibuat
    public SmartLamp(int brightness) {
        this.brightness = brightness;
        this.isOn = false;
    }

    // Dari interface Switchable: menyalakan lampu
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("[Lampu Pintar] Dinyalakan dengan kecerahan " + brightness + "%");
    }

    // Dari interface Switchable: mematikan lampu
    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("[Lampu Pintar] Dimatikan.");
    }

    // Dari interface Connectable: menghubungkan lampu ke WiFi
    // Syarat: lampu harus menyala dulu, jika masih mati tampilkan error lalu return
    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        if (!isOn) {
            System.out.println("[Error] Lampu Pintar masih mati! Nyalakan dulu (turnOn) sebelum terhubung ke WiFi.");
            return;
        }
        System.out.println("[WiFi Device] Terhubung ke jaringan: " + ssid + " (IP: " + ipAddress + ")");
    }
}