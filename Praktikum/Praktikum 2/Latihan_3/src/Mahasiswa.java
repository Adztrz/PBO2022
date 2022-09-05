public class Mahasiswa {
    String NIM, nama, alamat;
    char JK;

    Mahasiswa(String NIM, String nama, char JK, String alamat){
        this.NIM = NIM;
        this.nama = nama;
        this.JK = JK;
        this.alamat = alamat;
    }
    void cetakData() {
        System.out.println("Data Mahasiswa :");
        System.out.println("NIM : " + NIM);
        System.out.println("Nama : " + nama);
        System.out.println("Jenis Kelamin : " + JK);
        System.out.println("Alamat : " + alamat);
    }

    // buatlah constructor untuk menginisiasi nilai dari variabel
    // nim, nama, jenisKelamin, alamat
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("M0501001", "Patrick Star", 'L', "Bikini Bottom");
        mhs1.cetakData();

    }



}




