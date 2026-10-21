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
class ReThrowExc {
    static void demoThrow() {
        try {
            System.out.println("I'm throwing an exception from demoThrow "
                    + "method");
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("I'm catching the exception [" + e + "]");
            System.out.println("But I'll throw it again...\n");
            throw e;
        }
    }

    public static void main(String args[]) {
        try {
            demoThrow();
        } catch (NullPointerException e) {
            System.out.println("I'm catching the exception [" + e + "]\n "
                    + "thrown from demoThrow method");
        }
    }
}


/*
a. Jika exception e tidak dilempar (rethrown) dari method demoThrow, apakah masih
akan di tangkap dari dalam main function?

Jawab : 

Tidak. Jika throw e; dihapus, exception sudah selesai ditangani
di dalam demoThrow(), sehingga tidak ada exception
yang sampai ke main. Catch di main tidak akan dieksekusi.


b. Apa yang bisa Anda simpulkan dari kode program di atas?
Jawab : 

- Exception yang sudah ditangkap bisa dilempar ulang (rethrow) dengan "throw e;".
- Exception yang dilempar ulang naik ke method pemanggil (main) dan ditangkap di sana.
- Jika tidak dilempar ulang, exception dianggap sudah selesai ditangani di demoThrow(),
sehingga main tidak tahu ada exception.


*/