//Nama : Nicolas Adrian Partuaon Tambunan
//Nim  : 41425005
//Prodi : DIV Teknologi Rekayasa Perangkat Lunak


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_w7s02_41425005;

/**
 *
 * @author Nikolas
 */
public class UncaughtException {

    public static void main(String args[]) {
        System.out.println(3/0);
    }
   }

/*
a. Analisis apa yang akan terjadi ketika program di atas di eksekusi.
Jawab : a. Analisis: Program akan mengalami error crash saat dijalankan 
           karena mencoba membagi angka dengan nol
          (3/0) tanpa menggunakan blok penanganan error (try-catch)
b. Apa outputnya?
Jawab :
         Exception in thread "main" java.lang.ArithmeticException: / by zero
	 at pbo_w7s02_41425005.UncaughtException.main(UncaughtException.java:14)
         C:\Users\Nikolas\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:111: The following error occurred while executing this line:
         C:\Users\Nikolas\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:68: Java returned: 1
         BUILD FAILED (total time: 0 seconds)

*/



