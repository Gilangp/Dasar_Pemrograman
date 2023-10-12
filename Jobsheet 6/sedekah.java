import java.util.Scanner;
public class sedekah {
    public static void main(String[] args) {
        int saldo = 1000000;
        int pin = 123;
        int sedekah1, sedekah2, sedekah3;
        Scanner input13 = new Scanner (System.in);
        System.out.println("-----------------------------------------------");
        System.out.println("|              SELAMAT BERSEDEKAH             |");
        System.out.println("|            Silahkan Pilih Sedekah           |");
        System.out.println("|                                             |");
        System.out.println("|   1. sedekah1                               |");
        System.out.println("|   2. sedekah2                               |");
        System.out.println("|   3. sedekah3                               |");
        System.out.println("-----------------------------------------------");

        System.out.println("Pilih sedekah");
        int pilihSedekah = input13.nextInt();
        if (pilihSedekah == 1 || pilihSedekah == 2 || pilihSedekah == 3) {
            System.out.println("Masukkan sedekah yang ingin diberikan ");
            int inputSedekah = input13.nextInt();

            // konfirmasi
            System.out.println("-----------------------------------------------");
            System.out.println("|     Sedekah yang akan diberikan sebesar     |");
            System.out.println("|                                             |");
            System.out.println("                  Rp.  "+ inputSedekah + "  \t\t  ");
            System.out.println("|                                             |");
            System.out.println("-----------------------------------------------");
            System.out.println("| Keterangan :                                |");
            System.out.println("| - Jika benar ketik 'y'                      |");
            System.out.println("| - Jika salah klik 'n'                       |");
            System.out.println("-----------------------------------------------");

            char responSedekah = input13.next().charAt(0);
            if (responSedekah == 'y') {

                // konfirmasi pin
                System.out.println("Masukkan konfirmasi pin anda");
                int Pin = input13.nextInt();
                if ( Pin == pin) {
            saldo -= inputSedekah;
                System.out.println("-----------------------------------------------");
                System.out.println("|        BERSEDEKAH KEPADA Dompet DHUAFA      |");
                System.out.println("|                   BERHASIL                  |");
                System.out.println("|                                             |");
                System.out.println("                Sebesar Rp "+ inputSedekah);
                System.out.println("            Sisa saldo anda Rp "+ saldo);
                System.out.println("|                                             |");
                System.out.println("|                    Selesai                  |");
                System.out.println("-----------------------------------------------");
            } else {
                System.out.println("-----------------------------------------------");
                System.out.println("|               !! SEDEKAH GAGAL !!            |");
                System.out.println("|                 Pin Anda Salah               |");
                System.out.println("-----------------------------------------------");
            }
            } else {
                System.out.println("-----------------------------------------------");
                System.out.println("|             !! SEDEKAH GAGAL !!             |");
                System.out.println("-----------------------------------------------");
            }
        } else {
            System.out.println("-----------------------------------------------");
            System.out.println("|             !! SEDEKAH GAGAL !!             |");
            System.out.println("-----------------------------------------------");
        }
        }
}