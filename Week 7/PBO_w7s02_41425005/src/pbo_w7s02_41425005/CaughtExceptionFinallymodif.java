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
class CaughtExceptionFinallymodif {
    public static void main(String args[]) {
        int n = args.length;
        try {
            if (n == 0) {
                System.out.println(3/n);
                System.out.println("This won't be executed");
            } else {
                System.out.println("This will be executed if "
                        + "arguments is not zero");
            }
        } catch (NullPointerException e) {
            System.out.println("Catching exception: " + e);
        } finally {
            System.out.println("After trying or catching...");
        }
    }
}


/*
4. Modifikasi kode program no.3. Ganti Exception di dalam catch block dengan
NullPointerException. Eksekusi dan jalankan kode. Apa hasilnya

Jawab : 

run:
After trying or catching...
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at pbo_w7s02_41425005.CaughtExceptionFinallymodif.main(CaughtExceptionFinallymodif.java:16)
C:\Users\Nikolas\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:111: The following error occurred while executing this line:
C:\Users\Nikolas\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:68: Java returned: 1
BUILD FAILED (total time: 0 seconds)



dan jelaskan apa yang
terjadi jika sebuah exception tidak memiliki sebuah catch yang cocok?

Jawab :
Jika sebuah exception tidak memiliki blok catch yang tipenya cocok 
(karena ArithmeticException tidak cocok dengan NullPointerException),
maka exception tersebut menjadi tidak tertangani (uncaught).
Akibatnya, program akan dihentikan
secara paksa oleh Java, sementara blok finally 
(jika ada) akan tetap dijalankan sebelum program mati.
*/