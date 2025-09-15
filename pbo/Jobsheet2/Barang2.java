package Jobsheet2;

public class Barang2 {
    // tribut
    String kode;
    String namaBarang;
    int hargaAsli;
    double diskon; //dalam persen

    public int hitungHargaJual(){
        return hargaAsli - (int)(diskon/100*hargaAsli);
    }

    public void tampilData(){
        System.out.println("Kode Barang: " + kode);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Asli: " + hargaAsli);
        System.out.println("Diskon: " + diskon);
        System.out.println("Harga Jual: " + hitungHargaJual());
    }
}
