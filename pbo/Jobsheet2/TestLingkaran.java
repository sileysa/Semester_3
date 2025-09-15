package Jobsheet2;

public class TestLingkaran {
    public static void main(String[] args) {
        // buat objek lingkaran
        Lingkaran ling1 = new Lingkaran();
        ling1.r = 7; // jari-jari 7

        System.out.println("Lingkaran dengan jari-jari: " + ling1.r);
        System.out.println("Luas Lingkaran     = " + ling1.hitungLuas());
        System.out.println("Keliling Lingkaran = " + ling1.hitungKeliling());
    }
}