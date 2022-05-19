import java.util.Scanner;

public class Step8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("전기 사용량(kwh): ");

        int usage = scanner.nextInt();

        double cost = 0;
        double usagebelow300 = 300 * usage;
        double usage300to450 = (300 * 88.3) + ((usage - 300) * 182.9);
        double usage450to1000 = (300 * 88.3) + (150 * 182.9) + ((usage - 450) * 275.6);
        double usagemore1000 = (300 * 88.3) + (150 * 182.9) + (550 * 275.6) + ((usage - 1000) * 704.5);

        if (300 >= usage) {
            cost = usagebelow300;
        }
        if (300 < usage && 450 >= usage) {
            cost = usage300to450;
        }
        if (450 < usage && 1000 >= usage) {
            cost = usage450to1000;
        }
        if (1000 < usage) {
            cost = usagemore1000;
        }
        System.out.println("요금: " + cost);
    }
}
