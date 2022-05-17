import java.util.Scanner;

public class Ace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");

        int a = scanner.nextInt();

        System.out.print("b: ");

        int b = scanner.nextInt();

        int p = a + b;
        int m = a - b;
        int i = a * b;
        int s = a / b;
        int q = a % b;

        String result = p+","+m+","+i+","+s+","+q;

        System.out.println(result);

    }
        }