package pert5latihan01;

public class HitungVolume {
    //inisial property
    protected int Panjang, Lebar, Tinggi, Hasil;
    
    //Method hitung Volume Balok
    public int Volume(){
        this.Hasil = Panjang*Lebar*Tinggi;
        return Hasil;
    }
    //Method Tampilkan hasil perhitungan Volume Balok
    public void PrintHasil(){
        System.out.println("Nilai Volume Balok dengan :");
        System.out.println("Panjang: "+this.Panjang+" M");
        System.out.println("Lebar  : "+this.Lebar+" M");
        System.out.println("Tinggi : "+this.Tinggi+" M");
        System.out.println("Jadi volumnya adalah : "+this.Hasil+" M³");
    }
}
