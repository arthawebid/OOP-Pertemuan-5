package pert5latihan01;

public class Pert5Latihan01 {
    
    public static void main(String[] args) {
        //mendefinisikan class
        hitungv nvolbalok = new hitungv();
        
        //Set nilai properti
        nvolbalok.Panjang = 10;
        nvolbalok.Lebar = 8;
        nvolbalok.Tinggi = 5;
        
        //method hitung volum
        nvolbalok.Volume();
        
        //method tampilkan hasil
        nvolbalok.PrintHasil();
    }
}