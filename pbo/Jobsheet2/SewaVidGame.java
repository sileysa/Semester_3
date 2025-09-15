package Jobsheet2;

public class SewaVidGame {
    int id;
    String nama;
    String namaGame;
    int harga;
    int lamaSewa;

    public int hitungHarga(){
        return lamaSewa * harga;
    }

    public void tampilData(){
        System.out.println("ID Member: " + id);
        System.out.println("Nama Member: " + nama);
        System.out.println("Nama Game: " + namaGame);
        System.out.println("Harga per Hari: " + harga);
        System.out.println("Lama Sewa: " + lamaSewa + "hari");
        System.out.println("Total Harga: " + hitungHarga());
    }
}