interface Operasi {
    int tambah(int a,int b);
}
class Kalkulator implements Operasi {
    public int tambah(int a,int b){ return a+b; }
}