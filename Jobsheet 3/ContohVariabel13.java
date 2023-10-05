public class ContohVariabel13 {
    public static void main(String[] args) {
        String salahSatuHobiSayaAdalah = "Bermain Bulu Tangkis";
        boolean sayaRajin = true;
        char jenisKelamin = 'L';
        byte umurSayaSekarang = 18;
        double $ipk = 3.99, tinggi = 1.73;
        System.out.println("Saya suka          :" +salahSatuHobiSayaAdalah);
        System.out.println("Apakah saya rajin  :" + sayaRajin);
        System.out.println("Jenis kelamin saya :" + jenisKelamin);
        System.out.println("Umurku saat ini    :" + umurSayaSekarang);
        System.out.println(String.format("Saya ber ipk %s, dengan tinggi badan %s", $ipk, tinggi));
    }
}
