public class Kubus {
    int sisi = 5;

    public int hVolume() {
        int volume;
        volume = (int) Math.pow(this.sisi, 3);
        return volume;
    }

    public int hPermukaan(Kubus kubus) {
        int permukaan;
        permukaan = 6 * kubus.sisi * kubus.sisi;
        return permukaan;
    }

    public static void main(String[] args) {
        Kubus kubus = new Kubus();

        System.out.println(" ");
        System.out.println("--------------------------------------------");
        System.out.println("|Sisi Kubus              : " +kubus.sisi);
        System.out.println("|Volume Kubus            : " +kubus.hVolume());
        System.out.println("|Luas Permukaan Kubus    : " +kubus.hPermukaan(kubus));
        System.out.println("--------------------------------------------");
    }

}