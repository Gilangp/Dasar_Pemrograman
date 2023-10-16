import java.util.Scanner;

public class WhileKelipatan13 {

    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        int kelipatan, jumlah = 0, counter = 0;

        System.out.println("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = input13.nextInt();
        
        int i = 1;
        while (i <= 50) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
            i++;
        }
        double rataRata;

        if (counter != 0) {
            rataRata = (double) jumlah / counter;
        } else {
            rataRata = 0;
        }

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1-50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1-50 adalah %2f\n", kelipatan, rataRata);
    }
}
