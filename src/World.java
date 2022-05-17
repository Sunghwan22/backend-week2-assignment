import java.util.Scanner;

public class World {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input ");

        String message = scanner.nextLine();

        System.out.print(message);
        System.out.print(message);
        System.out.println(message);
    }
}
