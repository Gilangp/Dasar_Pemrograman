import java.util.Scanner;
public class HargaBayar13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String merkBuku;
        int harga, jumlah, dis, jmlHalaman;
        double total, bayar, jmlDis;
        System.out.println("Masukkan Judul Buku yang Dibeli ");
        merkBuku=input.nextLine();
        System.out.println("Masukkan Jumlah halaman pada buku yang dibeli ");
        jmlHalaman=input.nextInt();
        System.out.println("Masukkan Harga barang yang dibeli");
        harga=input.nextInt();
        System.out.println("Masukkan Jumlah barang yang dibeli");
        jumlah=input.nextInt();
        System.out.println("Masukkan besar diskon(%)");
        dis=input.nextInt();
        total=harga*jumlah;
        jmlDis=total*dis/100;
        bayar=total-jmlDis;
        System.out.println("Anda akan membeli buku dengan merk " +merkBuku);
        System.out.println("Dengan jumlah halaman              " + jmlHalaman);
        System.out.println("Diskon yang anda dapatkan adalah   " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah   " +bayar);
    }
}
