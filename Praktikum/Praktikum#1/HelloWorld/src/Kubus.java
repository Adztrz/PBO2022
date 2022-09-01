public class Kubus {
    int SisiKubus = 5;

    public static void main(String[] args) {
        Kubus kubus = new Kubus();

        System.out.println("              KUBUS");
        System.out.println("-------------------------------------");
        System.out.println("Sisi Kubus              : " +kubus.SisiKubus);
        System.out.println("Volume Kubus            : " +kubus.HitungVolume());
        System.out.println("Luas Permukaan Kubus    : " +kubus.HitungLuasPermukaan());
    }

    public Double HitungVolume() {
        double Volume;
        Volume = Math.pow(this.SisiKubus, 3);
        return Volume;
    }

    public int HitungLuasPermukaan() {
        int LuasPermukaan;
        LuasPermukaan = 6 * this.SisiKubus * this.SisiKubus;
        return LuasPermukaan;
    }
}