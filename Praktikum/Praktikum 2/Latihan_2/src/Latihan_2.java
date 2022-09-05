public class Latihan_2{
    public static class LatihanKonstanta {
        public static final int KURS_DOLLAR = 15000;
        public static final double PI = 3.14;
        public static final String NAMA = "Squidward";
        public static void main(String[] args) {
          //  KURS_DOLLAR = 13500; -> Error
            System.out.println(KURS_DOLLAR);
            System.out.println(PI);
            System.out.println(NAMA);
        }
    }
}

/*
    Apa maksud dari pesan error yang muncul?
    -> Tidak bisa memberikan value ke variabel final "KURS_DOLLAR", karena merupakan konstanta.

    Apa maksud penggunaan keyword static sebelum keyword final pada deklarasi variabel tersebut?
    -> Penggunaan keyword static memungkinkan untuk variable diakses langsung tanpa membuat object terlebih
       dahulu.
*/