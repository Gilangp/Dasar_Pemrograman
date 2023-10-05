import java.util.Scanner;
public class PercobaanPemilihan113Modifikasi {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        System.out.print("Masukkan angka:  ");
        int angka = input13.nextInt();
        String hasil =(angka % 2 == 0)?("Angka "+angka+" bilangan genap"):("Angka "+angka+" bilangan ganjil");
        System.out.println(hasil);
    }
}
