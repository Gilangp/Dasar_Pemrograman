import java.util.Scanner;

public class Login13 {
    public static void main(String[] args) {
        String username = "Gilang";
        int password = 123456;
        int maxAttempts = 3;
        int attempts = 0;

        Scanner input13 = new Scanner(System.in);

        while (attempts < maxAttempts) {
            System.out.print("Masukkan username: ");
            String inputUsername = input13.nextLine();
            System.out.print("Masukkan password: ");
            String inputPassword = input13.nextLine();

            if (inputUsername.equalsIgnoreCase(username) && inputPassword.equals(password)) {
                System.out.println("Login berhasil!");
                break;
            } else {
                System.out.println("Login gagal. Coba lagi.");
                attempts++;
            }
        }
        if (attempts == maxAttempts) {
            System.out.println("Batas login anda telah habis. Akun akan keluar.");
        }
        input13.close();
    }
}
