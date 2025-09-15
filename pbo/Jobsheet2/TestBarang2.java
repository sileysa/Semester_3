package Jobsheet2;

public class TestBarang2 {
    public static void main(String[] args) {
        Barang2 barang1 = new Barang2();

        barang1.kode = "BRG001";
        barang1.namaBarang = "Laptop Asus";
        barang1.hargaAsli = 10000000;
        barang1.diskon = 10;
        barang1.tampilData();
    }
}
