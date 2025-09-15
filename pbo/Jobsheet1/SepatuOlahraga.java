package Jobsheet1;

public class SepatuOlahraga extends Sepatu{
    String bahan;
    int harga;

    public void setBahan(String newValue) {
        bahan = newValue;
    }

    public void setHarga(int newValue) {
        harga = newValue;
    }

    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Bahan Sepatu Olahraga: " + bahan);
        System.out.println("Harga Sepatu Olahraga: " + harga);
    }
}