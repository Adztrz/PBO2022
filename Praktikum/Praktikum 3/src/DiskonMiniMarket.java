/*
tambahkan code untuk mengimplementasikan ketentuan diskon yang ditetapkan
tambahkan code untuk menampilkan nominal yang harus dibayar sesuai dengan ketentuan diskon yang diberikan
tambahkan code untuk menyimpan nominal total pembelian
*/

import java.util.Scanner;

public class DiskonMiniMarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Total pembelian : ");
        int diskon, dibayar;
        int nominal = input.nextInt();

        if (nominal < 50000){
            diskon = 0;
            dibayar = nominal-diskon;
        }
        else if (nominal > 50000 && nominal <= 75000 ){
            System.out.println("Anda mendapat diskon sebesar     5%");
            diskon = (nominal*5)/100;
            dibayar = nominal-diskon;
        }
        else if (nominal > 75000 && nominal <= 125000){
            System.out.println("Anda mendapat diskon sebesar     15%");
            diskon = (nominal*15)/100;
            dibayar = nominal-diskon;
        }
        else{
            System.out.println("Anda mendapat diskon sebesar      20%");
            diskon = (nominal*20)/100;
            dibayar = nominal-diskon;
        }

    System.out.println("Total Belanja Anda             : "+"Rp" +dibayar);


    }
}
