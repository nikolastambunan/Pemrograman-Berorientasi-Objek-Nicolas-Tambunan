
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



// Interface: kontrak untuk semua metode pembayaran
interface PaymentMethod {
    // Konstanta: di interface otomatis public static final, nilainya tidak bisa diubah
    // Biaya transaksi tetap yang bisa dipakai semua class yang mengimplementasikan
    double TRANSACTION_FEE = 2500.0;

    // Method abstrak: setiap metode pembayaran wajib menulis cara membayarnya sendiri
    void pay(double amount);

    // Method abstrak: mengembalikan keterangan metode pembayaran
    String getPaymentDetails();
}

// Pembayaran lewat e-wallet, dikenakan biaya admin sebesar TRANSACTION_FEE
class EWalletPayment implements PaymentMethod {
    // Nomor HP akun e-wallet, dibuat private (enkapsulasi)
    private String phoneNumber;

    // Constructor: menerima nomor HP pemilik e-wallet
    public EWalletPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Total yang dibayar = jumlah belanja + biaya admin
    @Override
    public void pay(double amount) {
        double total = amount + TRANSACTION_FEE;
        System.out.println("[E-Wallet " + phoneNumber + "] Pembayaran diproses: Rp" + amount
                + " (Biaya admin: Rp" + TRANSACTION_FEE + ") | Total: Rp" + total);
    }

    // Mengembalikan keterangan metode berupa teks
    @Override
    public String getPaymentDetails() {
        return "Metode: E-Wallet (" + phoneNumber + ")";
    }
}

// Pembayaran lewat kartu kredit, tidak memakai biaya admin
class CreditCardPayment implements PaymentMethod {
    // Nomor kartu kredit, dibuat private (enkapsulasi)
    private String cardNumber;

    // Constructor: menerima nomor kartu kredit
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    // Pembayaran langsung sebesar jumlah belanja, tanpa tambahan biaya
    @Override
    public void pay(double amount) {
        System.out.println("[Credit Card " + cardNumber + "] Pembayaran berhasil diverifikasi sebesar: Rp" + amount);
    }

    // Mengembalikan keterangan metode berupa teks
    @Override
    public String getPaymentDetails() {
        return "Metode: Kartu Kredit (" + cardNumber + ")";
    }
}