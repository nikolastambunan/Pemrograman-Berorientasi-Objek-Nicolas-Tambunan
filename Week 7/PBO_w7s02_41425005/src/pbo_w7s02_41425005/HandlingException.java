//Nama : Nicolas Adrian Partuaon Tambunan
//Nim  : 41425005
//Prodi : DIV Teknologi Rekayasa Perangkat Lunak


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w7s02_41425005;

/**
 *
 * @author Nikolas
 */
public class HandlingException {
    public static void main(String[] args) {
        try {
            System.out.println(3/0);
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        }
    }
}


/*
a. Ganti ex dengan ex.getMessage() dan ex.getStackTrace(). Coba juga untuk
mengeksekusi statement ex.printStackTrace() dan lihat apa hasilnya.

Jawab : 
1. ex.getMessage()
run:
Error / by zero
BUILD SUCCESSFUL (total time: 0 seconds)

2.ex.getStackTrace() 
run:
Error [Ljava.lang.StackTraceElement;@10f87f48
BUILD SUCCESSFUL (total time: 0 seconds)

3.ex.printStackTrace()
Exception in thread "main" java.lang.RuntimeException: Uncompilable code - 'void' type not allowed here
	at pbo_w7s02_41425005.HandlingException.main(HandlingException.java:1)
C:\Users\Nikolas\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:111: The following error occurred while executing this line:
C:\Users\Nikolas\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:68: Java returned: 1
BUILD FAILED (total time: 0 seconds)






b. Ganti AtirhmeticException dengan Exception. Apa hasilnya? Jelaskan.

Jawab : 
Hasil: Output program akan tetap sama, yaitu Error java.lang.ArithmeticException: / by zero.
Alasan: Exception adalah kelas induk (superclass) dari semua
jenis error di Java (termasuk ArithmeticException). 
Oleh karena itu, blok catch 
(Exception ex) dapat menangkap berbagai macam jenis error, termasuk pembagian dengan nol.
*/