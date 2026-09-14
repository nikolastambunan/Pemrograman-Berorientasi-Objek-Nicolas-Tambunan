int[] nilai = {80, 90, 75, 88};
int total = 0;
for(int n : nilai){ 
    total += n;
}
double rata = (double)total/nilai.length;
System.out.println("Rata-rata = " + rata);