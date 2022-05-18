import java.util.Scanner;

public class Step7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이용시간(분): ");

        int time = scanner.nextInt();

        System.out.print("파킹존 주차여부: ");

        String y = scanner.next();
        String O = "O";
        String X = "X";

        if (y.equals(O)) {
            System.out.println("요금 :" + (900 + 135 * time));
        }
        if (y.equals(X)) {
            System.out.println("요금: " + (1000 + 150 * time + 3000));
        }
    }
}
