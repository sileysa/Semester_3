package Jobsheet1;

public class SepatuDemo {
    public static void main(String[] args) {
        Sepatu sepatu1 = new Sepatu();
        SepatuOlahraga sepatu2 = new SepatuOlahraga();
        SepatuFlat sepatu3 = new SepatuFlat();

        sepatu1.setMerek("Adidas");
        sepatu1.setJenis("Sepatu Fantofel");
        sepatu1.cetakInformasi();

        System.out.println();

        sepatu2.setMerek("Bata");
        sepatu2.setJenis("Sepatu Olahraga");
        sepatu2.setBahan("Kulit");
        sepatu2.setHarga(200000);
        sepatu2.cetakInformasi();

        System.out.println();

        sepatu3.setMerek("Urban");
        sepatu3.setJenis("Sepatu Flat");
        sepatu3.setWarna("Merah");
        sepatu3.setUkuran(40);
        sepatu3.cetakInformasi();
    }
}