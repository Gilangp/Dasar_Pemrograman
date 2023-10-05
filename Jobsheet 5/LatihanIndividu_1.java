import java.util.Scanner;
public class LatihanIndividu_1 {
    public static void main(String[] args) {
        int jarak;
        Scanner input29 = new Scanner(System.in);
        System.out.print("Masukkan jarak: ");
        jarak = input29.nextInt();
        if (jarak <= 5) {
            System.out.println("Jarak anda kurang dari 5 km, anda harus menggunakan Melee Weapon");
        }else if(jarak >= 5 && jarak <= 100) {
            System.out.println("Jarak anda lebih dari 5 km, anda harus menggunakan Ranged Weapon");
        }
    }
}
