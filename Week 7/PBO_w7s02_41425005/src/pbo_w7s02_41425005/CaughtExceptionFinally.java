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
class CaughtExceptionFinally {
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
        } catch (Exception e) {
            System.out.println("Catching exception: " + e);
        } finally {
            System.out.println("After trying or catching...");
        }
    }
}


/*
Catching exception: java.lang.ArithmeticException: / by zero
After trying or catching

b. Coba eksekusi program di atas dengan arguments. Apa hasilnya?  
Jawab :  
This will be executed if arguments is not zero
After trying or catching

c. Jelaskan kesimpulan Anda dari pertanyaan a dan b setelah menjalankan program.  
Jawab :  
Tanpa argumen, program mengalami error pembagian dengan nol sehingga blok `catch` 
menangkap error tersebut
Dengan argumen, program melewati blok `if` dan menjalankan blok `else`
tanpa error . Blok `finally` akan **selalu dieksekusi**
di bagian akhir pada kondisi apa pun.
*/