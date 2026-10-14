/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan2;

/**
 *
 * @author Nikolas
 */
// 1. Membuat Interface Kendaraan
interface Kendaraan {
    void gas(); // Kontrak: Semua kendaraan wajib bisa digas
    void rem(); // Kontrak: Semua kendaraan wajib bisa direm
}

// 2. Kelas Mobil yang mengimplementasikan interface Kendaraan
class Mobil implements Kendaraan {
    @Override
    public void gas() {
        System.out.println(" Mobil: Pedal diinjak, mesin V8 menderu kencang!");
    }


    @Override
    public void rem() {
        System.out.println(" Mobil: Rem cakram pakem, mobil berhenti mulus.");
    }
}

// 3. Kelas Motor yang juga mengimplementasikan interface Kendaraan
class Motor implements Kendaraan {
    @Override
    public void gas() {
        System.out.println("️ Motor: Gas ditarik, suara knalpot nyaring!");
    }

    
    @Override
    public void rem() {
        System.out.println("️ Motor: Rem tangan dan kaki ditekan, motor berhenti.");
    }
}



