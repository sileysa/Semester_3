package Jobsheet2;

public class Lingkaran {
    //atribut
    double phi = 3.14;
    double r;

    // method untuk menghitung luas
    public double hitungLuas() {
        return phi * r * r;
    }

    // method untuk menghitung keliling
    public double hitungKeliling() {
        return 2 * phi * r;
    }
}