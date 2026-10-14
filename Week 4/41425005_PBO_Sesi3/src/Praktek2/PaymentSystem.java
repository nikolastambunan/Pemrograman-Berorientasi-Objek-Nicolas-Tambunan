
/*
Nama : Nicolas Adrian Partuaon Tambunan
Nim  : 41425005
Prodi  : DIV TRpl 25
*/



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktek2;

/**
 *
 * @author Nikolas
 */
// Class utama untuk menjalankan dan menguji sistem pembayaran
public class PaymentSystem {
    public static void main(String[] args) {
        // Polimorfisme: dua objek berbeda disimpan dalam variabel bertipe sama (PaymentMethod)
        PaymentMethod payment1 = new EWalletPayment("08123456789");
        PaymentMethod payment2 = new CreditCardPayment("4111-XXXX-XXXX-1234");

        // Menjalankan pay() versi EWalletPayment: ada biaya admin 2500
        // Output: Pembayaran Rp50000.0, biaya admin Rp2500.0, total Rp52500.0
        payment1.pay(50000);

        // Menjalankan  versi CreditCardPayment: tanpa biaya admin
        // Output: Pembayaran berhasil diverifikasi sebesar Rp150000.0
        payment2.pay(150000);
    }
}