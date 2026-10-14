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
// Interface: kontrak untuk perangkat yang bisa terhubung ke WiFi
// Class yang mengimplementasikan interface ini wajib menulis isi method-nya
public interface Connectable {
    // Method abstrak (tanpa isi): ssid adalah nama jaringan WiFi,
    // ipAddress adalah alamat IP yang dipakai perangkat
    void connectToWifi(String ssid, String ipAddress);
}