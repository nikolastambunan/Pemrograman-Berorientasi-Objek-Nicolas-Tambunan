/*
Nama : Nicolas Adrian Partuaon Tambunan
Nim  : 41425005
Prodi  : DIV TRpl 25
*/



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktek1;

/**
 *
 * @author Nikolas
 */

// Class untuk menyimpan data rekening bank beserta operasi setor dan tarik
public class BankAccount {
    // Atribut private (enkapsulasi), hanya bisa diakses lewat method
    private String accountNumber;
    private double balance;

    // Constructor: saldo awal negatif tidak diterima, otomatis diatur ke 0
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Saldo awal tidak boleh negatif! Diatur ke 0.");
            this.balance = 0;
        }
    }

    // Getter untuk membaca nomor rekening dan saldo
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Setor tunai: jumlah harus lebih dari 0, jika valid saldo bertambah
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Setor berhasil: Rp" + amount);
        } else {
            System.out.println("Jumlah setoran harus lebih besar dari 0!");
        }
    }

    // Tarik tunai: ditolak jika jumlah tidak valid atau melebihi saldo,
    // jika lolos kedua pengecekan saldo berkurang
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Jumlah penarikan tidak valid!");
        } else if (amount > this.balance) {
            System.out.println("Penarikan gagal: Saldo tidak mencukupi!");
        } else {
            this.balance -= amount;
            System.out.println("Tarik tunai berhasil: Rp" + amount);
        }
    }

    // Method main untuk menguji class
    public static void main(String[] args) {
        // Rekening dibuat dengan saldo awal 500000
        BankAccount acc = new BankAccount("ACC-001", 500000);

        // Ditolak karena jumlah negatif, saldo tetap 500000
        acc.deposit(-100000);

        // Ditolak karena 700000 melebihi saldo, saldo tetap 500000
        acc.withdraw(700000);

        // Berhasil, saldo menjadi 300000
        acc.withdraw(200000);

        // Menampilkan saldo akhir: Rp300000.0
        System.out.println("Saldo akhir akun " + acc.getAccountNumber() + ": Rp" + acc.getBalance());
    }
}