import java.util.Scanner;
public class WhileGaji132 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0;
        double totalGajiLembur = 0;
        String jabatan;

        System.out.println("Masukkan jumlah karyawan ");
        jumlahKaryawan = input13.nextInt();

        int i = 0;
        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.println("Masukkan jabatan karyawan ke- " + (i+1) + "; ");
            jabatan = input13.next();
            System.out.println("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = input13.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            }else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur*100000;
            }
            else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur*75000;
            }
            else {
                System.out.println("Jabatan yang anda masukkan salah, Silahkan masukkan jabatan yang benar.");
                i--;
                continue;
            }
            totalGajiLembur += gajiLembur;
            System.out.println("Total gaji lembur: " + totalGajiLembur);
        }
    }
}
