package Jobsheet2;

public class TestSewaVidGame {
    public static void main(String[] args) {
        SewaVidGame sewa1 = new SewaVidGame();
        SewaVidGame sewa2 = new SewaVidGame();

        sewa1.id = 101;
        sewa1.nama = "Andi";
        sewa1.namaGame = "GTA V";
        sewa1.harga = 20000;
        sewa1.lamaSewa = 3;
        sewa1.tampilData();

        sewa2.id = 102;
        sewa2.nama = "Budi";
        sewa2.namaGame = "FIFA 23";
        sewa2.harga = 18000;
        sewa2.lamaSewa = 5;
        sewa2.tampilData();
    }
}