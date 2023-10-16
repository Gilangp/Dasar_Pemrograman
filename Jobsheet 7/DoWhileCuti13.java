import java.util.Scanner;
public class DoWhileCuti13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.println("Jatah cuti: ");
        jatahCuti = input13.nextInt();

        do {
            System.out.println("Apakah anda ingin mengambil cuti (Y/N) ");
            konfirmasi = input13.next();

            if (konfirmasi.equalsIgnoreCase("Y")) {
                System.out.println("jumlah hari ");
                jumlahHari = input13.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                    break;
                }
            }
        } while (jatahCuti > 0);
    }
}
