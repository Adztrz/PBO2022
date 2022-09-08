public class Latihan_1 {
    public static void main(String[] args) {
   //   long p = 2147483648; -> Error
        long p = 2147483648L;
        System.out.println(p);
    }
}

    /*
    Apa maksud dari pesan error yang muncul?
    -> Angka tersebut terlalu besar untuk integer.

    Bagaimana memperbaiki source code tersebut?
    -> Dengan menambahkan L dibelakang angka agar tipe data dari variabel p tersebut berubah menjadi long.
    */

