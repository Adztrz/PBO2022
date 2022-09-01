import java.util.Scanner;

public class Mahasiswa {
    String NIM, nama, JK, alamat;

public void isiData(String NIM, String nama, String JK, String alamat){
    this.NIM = NIM;
    this.nama = nama;
    this.JK = JK;
    this.alamat = alamat;

}

public void printData(){
    System.out.println("_____________________________");
    System.out.println("NIM:           "+this.NIM);
    System.out.println("Nama:          "+this.nama);
    System.out.println("Jenis Kelamin: "+this.JK);
    System.out.println("Alamat:        "+this.alamat);
    System.out.println("_____________________________");

}

    public static void main(String[] args){
        Mahasiswa mahasiswa = new Mahasiswa();
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan NIM: ");
        String NIM = input.nextLine();

        System.out.println("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.println("Masukkan Jenis Kelamin: ");
        String JK = input.nextLine();

        System.out.println("Masukkan Alamat: ");
        String alamat = input.nextLine();

        mahasiswa.isiData(NIM, nama, JK, alamat);
        mahasiswa.printData();

        input.close();

    }
}
