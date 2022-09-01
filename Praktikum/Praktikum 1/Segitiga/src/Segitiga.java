public class Segitiga {
    int alas = 3;
    int tinggi = 4;
    int sisiMiring = 5;

public Double hitungLuas(){
    return 0.5 * alas * tinggi;
}

public int hitungKeliling(){
    return alas + tinggi + sisiMiring;
}

    public static void main(String[] args){
        Segitiga segitiga = new Segitiga();
        System.out.println("Alas               :"+segitiga.alas);
        System.out.println("Tinggi             :"+segitiga.tinggi);
        System.out.println("Sisi Miring        :"+segitiga.sisiMiring);
        System.out.println("Luas Segitiga      :"+segitiga.hitungLuas());
        System.out.println("Keliling Segitiga  :"+segitiga.hitungKeliling());






    }
}
