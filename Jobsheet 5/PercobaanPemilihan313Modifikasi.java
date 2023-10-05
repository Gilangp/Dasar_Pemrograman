import java.util.Scanner;
public class PercobaanPemilihan313Modifikasi {
    public static void main(String[] args) {
        double angka1, angka2, hasil;
        char operator;
        Scanner input13 = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        angka1 = input13.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        angka2 = input13.nextDouble();
        System.out.print("Masukkan operator (+ - * /): ");
        operator = input13.next().charAt(0);
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + "=" + hasil);
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + "=" + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + "=" + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + "=" + hasil);
                break;
        }
    }
}
