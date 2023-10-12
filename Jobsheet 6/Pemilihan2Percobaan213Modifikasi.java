import java.util.Scanner;
public class Pemilihan2Percobaan213Modifikasi {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        //var
        float sudut1, sudut2, sudut3, totalSudut;

        //input
        System.out.println("Masukkan sudut pertama: ");
        sudut1 = input13.nextFloat();
        System.out.println("Masukkan sudut kedua: ");
        sudut2 = input13.nextFloat();
        System.out.println("Masukkan sudut ketiga: ");
        sudut3 = input13.nextFloat();

        //process
        totalSudut = sudut1 + sudut2 + sudut3;
        if (totalSudut == 180){
            if((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
            System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else if((sudut1 == sudut2) && (sudut1 == sudut3) && (sudut2 == sudut3))
            System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            else if((sudut1 == sudut2) || (sudut1 == sudut3) || (sudut2 == sudut3))
            System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            else
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
        } else
        System.out.println("Bukan segitiga");
    }
}
