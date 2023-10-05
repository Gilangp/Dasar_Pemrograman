import java.util.Scanner;
public class PercobaanPemilihan213Modifikasi {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        System.out.print("Nilai uas   : ");
        float uas = input13.nextFloat();
        System.out.print("Nilai uts   : ");
        float uts = input13.nextFloat();
        System.out.print("Nilai kuis  : ");
        float kuis = input13.nextFloat();
        System.out.print("Nilai tugas : ");
        float tugas = input13.nextFloat();
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message;
        if (total <= 100 && total > 80){
            message = "Nilai anda 'A' dan Setara '4' dengan Kualifikasi Sangat Baik";
        }else if (total <=80 && total > 73){
            message = "Nilai anda 'B+' dan Setara '3.5' dengan Kualifikasi Lebih dari Baik";
        }else if ( total <=73 && total > 65){
            message = "Nilai anda 'B' dan Setara '3' dengan Kualifikasi Baik";
        }else if ( total <=65 && total > 60){
            message = "Nilai anda 'C+' dan Setara '2.5' dengan Kualifikasi Lebih dari Cukup";
        }else if ( total <=60 && total > 50){
            message = "Nilai anda 'C' dan Setara '2' dengan Kualifikasi Cukup";
        }else if ( total <=50 && total > 39){
            message = "Nilai anda 'D' dan Setara '1' dengan Kualifikasi Kurang";
        }else {
            message = "Nilai anda 'E' dan Setara '0' dengan Kualifikasi Gagal";
        }
        System.out.println("Nilai akhir = " + total + " sehingga " + message);
    }
}
