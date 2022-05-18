import java.util.Scanner;

public class Stamp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();

        int plus = a + b;
        int minus = a - b;
        int multiply = a * b;
        int division = a / b;
        int remain = a % b;

        String result = plus + "," + minus + "," + multiply + "," + division + "," + remain;

        System.out.println(result);
    }
}
