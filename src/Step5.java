import java.util.Scanner;

public class Step5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input 2 numbers");

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(x + "+" + y + "= ?");

        int answer1 = scanner.nextInt();

        System.out.println(x + "*" + y + "= ?");

        int answer2 = scanner.nextInt();

        boolean result = answer1 == x + y;
        boolean result2 = answer2 == x * y;

        if (result && result2) {
            System.out.println("Genius!");
        }
        if (!result && result2 || result && !result2) {
            System.out.println("Muggle!");
        }
        if (!result && !result2) {
            System.out.print("Stupid");
        }
    }
}







