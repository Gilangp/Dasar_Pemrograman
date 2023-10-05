import java.util.Scanner;
public class LatianIndividu_2 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        String username = "admin";
        String password = "123";


        System.out.print("Masukkan username: ");
        String inputUsername = input13.nextLine();


        System.out.print("Masukkan password: ");
        String inputPassword = input13.nextLine();


        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login Berhasil! " + inputUsername + ".");
        } else {
            System.out.println("user dan password salah.");
        }
    }
}
