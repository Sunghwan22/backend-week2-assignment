import java.util.Scanner;

public class Step10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 2 Numbers: ");

        int count = 0;
        while (count < 3) {

            int x = scanner.nextInt();
            int y = scanner.nextInt();

            System.out.println(x + "+" + y + "= ?");
            int answer = scanner.nextInt();

            boolean result = answer == x + y;

            if (result) {
                count += 1;
            }

            if (result) {
                System.out.println("you are right!("+count+")");
            }
            if (!result) {
                System.out.println("Nope!");
            }
        }
        System.out.println("Escape");
    }

}


