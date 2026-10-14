/*Nama : Nicolas Adrian Partuaon Tambunan
  Nim  : 41425005
Prodi  : Strpl-1*/


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package del.ac.id.induk;

import del.ac.id.Main.*;

/**
 *
 * @author Nikolas
 */

public interface IKendaraan {
    void setJlhRoda(int value);
    void setDimensiKendaraan(int value);
    void setJlhSpion(int value);
    void setWarnaKendaraan(String value);
    void cetakInformasi(Object o);
    int getJlhRoda();
    int getDimensiKendaraan();
    int getJlhSpion();
    float kalkulasiPercepatan(int jlhTorsi, float panjangGagang, float rasioGigi);
    String getWarnaKendaraan();
}
