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
// Karena itu ketiga method tersebut wajib ditulis di class ini
public class SmartAC implements Switchable, Connectable {
    // Suhu AC dan status nyala/mati, dibuat private (enkapsulasi)
    private int temperature;
    private boolean isOn;

    // Constructor: menerima suhu awal, AC dalam keadaan mati saat dibuat
    public SmartAC(int temperature) {
        this.temperature = temperature;
        this.isOn = false;
    }

    // Dari interface Switchable: menyalakan AC
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("[AC Pintar] Dinyalakan pada suhu " + temperature + " C");
    }

    // Dari interface Switchable: mematikan AC
    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("[AC Pintar] Dimatikan.");
    }

    // Dari interface Connectable: menghubungkan AC ke WiFi
    // Syarat: AC harus menyala dulu, jika masih mati tampilkan error lalu return
    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        if (!isOn) {
            System.out.println("[Error] AC Pintar masih mati! Nyalakan dulu (turnOn) sebelum terhubung ke WiFi.");
            return;
        }
        System.out.println("[WiFi Device] Terhubung ke jaringan: " + ssid + " (IP: " + ipAddress + ")");
    }
}