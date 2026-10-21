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
class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("I'm throwing a non Runtime exception that I "
                + "don't handle");
        System.out.println("Without specifying in method declaration");
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[]) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Caught " + e);
        }
    }
}


/*
a. Apa yang akan terjadi jika kode program di atas dieksekusi? Mengapa?
Jawab :

run:
Exception in thread "main" java.lang.RuntimeException: Uncompilable code - unreported exception <any>; must be caught or declared to be thrown
	at pbo_w7s02_41425005.ThrowsDemo.throwOne(ThrowsDemo.java:1)
	at pbo_w7s02_41425005.ThrowsDemo.main(ThrowsDemo.java:20)
C:\Users\Nikolas\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:111: The following error occurred while executing this line:
C:\Users\Nikolas\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:68: Java returned: 1
BUILD FAILED (total time: 0 seconds)

Bakalan Eror karena : 
1. Salah ketik: IllegalAccesException seharusnya IllegalAccessException,
jadi compiler tidak menemukan class-nya.
Checked exception tidak ditangani:
throwOne() melempar exception tanpa throws, dan main memanggilnya tanpa try-catch. Java mewajibkan salah satunya.


 == >  Setelah di tambahai kode nya  Pada static Void main 
Jawab : 
run:
I'm throwing a non Runtime exception that I don't handle
Without specifying in method declaration
Caught java.lang.IllegalAccessException: demo
BUILD SUCCESSFUL (total time: 0 seconds)


Sukses : 
Nama class benar: IllegalAccessException (pakai “ss” ganda).
Checked exception sudah ditangani: throwOne() memakai throws IllegalAccessException, dan main memanggilnya di dalam try-catch.


b. Apa yang akan terjadi jika IllegalAccessException diganti dengan
ArithmeticException? Mengapa? Perbaiki kode program di atas seperti yang
ditunjukkan di bawah ini:

Jawab : 

run:
I'm throwing a non Runtime exception that I don't handle
Without specifying in method declaration
Caught java.lang.IllegalAccessException: demo
BUILD SUCCESSFUL (total time: 0 seconds)


Mengapa : ArithmeticException adalah unchecked exception (turunan RuntimeException),
jadi Java tidak mewajibkan throws di method maupun try-catch di main.
Keduanya boleh dihapus dan kode tetap bisa dikompilasi.

*/
