import java.util.Scanner;
public class PemilihanPercobaan113 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        System.out.print("Masukkan angka:  ");
        int angka = input13.nextInt();
        if (angka % 2 == 0)
        System.out.println("Angka "+angka+" bilangan genap");
        else
        System.out.println("Angka "+angka+" bilangan ganjil");
    }
}
