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
class MultipleCatch {
    public static void main(String args[]) {
        int n = args.length;
        int a = 1;
        int c[] = new int[1];
        try {
            if (n == 0)
                a = a / (a - 1);
            else
                c[21] = 5;
        } catch (ArithmeticException e) {
            System.out.println("Ups, seem out we have an Arithmetic "
                    + "Exception here...");
        } catch (Exception e) {
            System.out.println("Let the other exception handler here...");
        }
    }
}

/*
a. Coba eksekusi program tanpa arguments. Catch statement mana yang dieksekusi

Jawab : 
run:
Ups, seem out we have an Arithmetic Exception here...
BUILD SUCCESSFUL (total time: 0 seconds)

b. Coba eksekusi program dengan sebuah argument. Catch statement mana yang dieksekusi?

Jawab : Catch statement mana yang dieksekusi 
==> 
} catch (Exception e) {
    System.out.println("Let the other exception handler here...");
}
run:
Let the other exception handler here...
BUILD SUCCESSFUL (total time: 0 seconds)

c. Sekarang, ganti ArithmeticException dengan Excception sepeti yang ditunjukkan di
bawah ini:
Jawab : 
run:

Exception in thread "main" java.lang.RuntimeException: Uncompilable code - exception java.lang.ArithmeticException has already been caught
at pbo_w7s02_41425005.MultipleCatch.main(MultipleCatch.java:1)
C:\Users\Nikolas\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:111: The following error occurred while executing this line:
C:\Users\Nikolas\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:68: Java returned: 1
BUILD FAILED (total time: 0 seconds)

==>  Apa yang terjadi? Mengapa? Jelaskan
Jawab : Program gagal dikompilasi dengan error exception ArithmeticException has already been caught.


Mengapa? Exception adalah superclass dari ArithmeticException.
Karena catch (Exception e) ada di atas,
ia sudah menangkap semua exception, sehingga catch 
(ArithmeticException e) di bawahnya tidak akan pernah tercapai. Java menganggap ini error.

*/

