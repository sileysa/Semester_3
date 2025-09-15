package Jobsheet1;

public class Buku {
    String judul;
    int jumlahHalaman;

    public void setJudul(String newValue){
        judul = newValue;
    }

    public void jumlahHalaman(int increment){
        jumlahHalaman = jumlahHalaman + increment;
    }

    public void cetakInformasi() {
        System.out.println("Judul Buku: " + judul);
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
    }
}