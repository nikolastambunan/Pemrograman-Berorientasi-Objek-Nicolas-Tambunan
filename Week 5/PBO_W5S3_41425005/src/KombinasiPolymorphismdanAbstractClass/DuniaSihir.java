/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KombinasiPolymorphismdanAbstractClass;

/**
 *
 * @author Nikolas
 */
public class DuniaSihir {
    public static void main(String[] args) {
        Penyihir harry = new Penyihir ("Harry Potter");
        Mantra expelliarmus = new Expelliarmus();
        Mantra expectoPatronum = new ExpectoPatronum();

        harry.belajarMantra (expelliarmus);
        harry.belajarMantra (expectoPatronum);

        harry.ucapkanMantra("Expelliarmus");
        harry.ucapkanMantra ("Expecto Patronum");
        harry.ucapkanMantra("Lumos"); // Harry belum belajar Lumos

        // Tambahkan mantra Lumos dan coba Lagi
        Mantra lumos = new Lumos();
        harry.belajarMantra (lumos);
        harry.ucapkanMantra ("Lumos");
    }
}
