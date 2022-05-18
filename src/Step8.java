import java.util.Scanner;

public class Step8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("전기 사용량(kwh): ");

        int usage = scanner.nextInt();

        double cost = 0;

        if (300 >= usage) {
            cost = 88.3 * usage;
        }
        if (300 < usage && 450 >= usage) {
            cost = (300 * 88.3) + ((usage - 300) * 182.9);
        }
        if (450 < usage && 1000 >= usage) {
            cost = (300 * 88.3) + (150 * 182.9) + ((usage - 450) * 275.6);
        }
        if (1000 < usage) {
            cost = (300 * 88.3) + (150 * 182.9) + (550 * 275.6) + ((usage - 1000) * 704.5);
        }
        System.out.println("요금: " + cost);
    }
}
