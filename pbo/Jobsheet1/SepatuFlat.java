package Jobsheet1;

public class SepatuFlat extends Sepatu{
    String warna;
    int ukuran;

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void setUkuran(int newValue) {
        ukuran = newValue;
    }

    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Warna Sepatu: " + warna);
        System.out.println("Ukuran Sepatu: " + ukuran);
    }
}