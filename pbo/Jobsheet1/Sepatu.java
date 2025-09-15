package Jobsheet1;

public class Sepatu {
    String merek;
    String jenis;

    public void setMerek(String newValue){
        merek = newValue;
    }

    public void setJenis(String newValue) {
        jenis = newValue;
    }

    public void cetakInformasi() {
        System.out.println("Merek: " + merek);
        System.out.println("Jenis: " + jenis);
    }
}