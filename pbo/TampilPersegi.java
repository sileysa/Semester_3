public class TampilPersegi {
    public static void main(String[] args) {
        Persegi p = new Persegi(5);

        p.dataPersegi();
        System.out.println("Luas Persegi: " + p.luasPersegi());
        System.out.println("Keliling Persegi: " + p.kelilingPersegi());
    }
}