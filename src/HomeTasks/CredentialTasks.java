package HomeTasks;
import java.util.Scanner;
public class CredentialTasks {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("inter your username");
String username = scanner.nextLine();
        System.out.println("inter your password");
        String password = scanner.nextLine();
        if ((username.equals(password))&&(password.equals(username))) {
            System.out.println("welcome" + username);
        }
        else {
            System.out.println("connection failed");
        }


    }
}
