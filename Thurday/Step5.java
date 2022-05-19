import java.util.Scanner;

public class Step5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input 2 Numbers: ");

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(x + "+" + y + "= ?");

        int answer1 = scanner.nextInt();

        System.out.println(x + "*" + y + "= ?");

        int answer2 = scanner.nextInt();

        boolean result1 = x + y == answer1;
        boolean result2 = x * y == answer2;

        String grade = "";

        if (result1 && result2) {
            grade = "Genius";
        }
        if (!result1 && result2) {
            grade = "Muggle";
        }
        if (result1 && !result2) {
            grade = "Muggle";
        }
        if (!result1 && !result2) {
            grade = "Stupid";
        }
        System.out.println(grade + "!");

    }
}








