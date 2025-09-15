package Jobsheet1;

public class BukuDemo {
    public static void main(String[] args) {
        Buku buku1 = new Buku();

        buku1.setJudul("Harry Potter");
        buku1.jumlahHalaman(100);
        buku1.jumlahHalaman(50);
        buku1.cetakInformasi();
    }
}