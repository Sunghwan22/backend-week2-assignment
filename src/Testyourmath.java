import java.util.Scanner;

public class Testyourmath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 2 Numbers :");

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(x + "+" + y + "= ?");

        int answer1 = scanner.nextInt();

        System.out.println(x + "*" + y + "= ?");

        int answer2 = scanner.nextInt();

        if (answer1 == x + y && answer2 == x * y)
                System.out.println("Genius ");



        if (answer1 != x + y || answer2 == x * y)
            System.out.println("Muggle!");


        if (answer1 == x + y || answer2 != x * y)
            System.out.println("Muggle!");


        if (answer1 != x + y && answer2 != x * y)
            System.out.println("Stupid");
        }
    }