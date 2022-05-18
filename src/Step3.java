import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("what's your name: ");

        String name = scanner.next();

        System.out.println("Hello," + name + "!");
    }
}
