import java.util.Scanner;

public class Stamp3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Megap : Input 2 Number: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int answer = (a + b) * 10;

        System.out.println("Translation for Megap: " + (answer * 10));

    }
}
