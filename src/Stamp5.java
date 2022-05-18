import java.util.Scanner;

public class Stamp5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("핸드폰 번호: ");
        String number = scanner.next();

        String maskednumber = number.substring(0, 7) + "****";

        System.out.println(maskednumber);

    }
}
