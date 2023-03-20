package HomeTasks;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class MonthsTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please inter a number (1-12): ");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.println("the month is january");
                break;
            case 2:
            System.out.println("the month in february");
            break;
            case 3:
            System.out.println("the month is march");
            break;
            case 4:
            System.out.println("the month is april");
            break;
            case 5:
            System.out.println("the month is may");
            break;
            case 6:
            System.out.println("the month is june");
            break;
            case 7:
            System.out.println("the month is july");
            break;
            case 8:
            System.out.println("the mont is august");
            break;
            case 9:
            System.out.println("the month is september");
            break;
            case 10:
            System.out.println("the month is october");
            break;
            case 11:
            System.out.println("the month is november");
            break;
            case 12:
            System.out.println("the month is december");
            break;
            default:
                System.out.println("the month is not valid");
                break;
        }
    }
}
