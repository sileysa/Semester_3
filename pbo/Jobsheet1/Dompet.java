package Jobsheet1;

public class Dompet {
    String warna;
    int jumlahUang;

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void jumlahUang(int increment) {
        jumlahUang = jumlahUang + increment;
    }

    public void cetakInformasi() {
        System.out.println("Warna Dompet: " + warna);
        System.out.println("Jumlah Uang di Dompet: " + jumlahUang);
    }
}