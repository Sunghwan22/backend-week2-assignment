import java.util.Scanner;

public class Step6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" 운동 종류: ");

        String name = scanner.nextLine();
        String cycle = "자전거";
        String walk = "걷기";
        String run = "달리기";

        System.out.print("체중(kg): ");

        int weight = scanner.nextInt();
        System.out.print("운동시간(분): ");

        int time = scanner.nextInt();

        double kcal1 = (double) ((2.3 / 15) * time * weight);
        double kcal2 = (double) ((0.9 / 15) * time * weight);
        double kcal3 = (double) ((2.0 / 15) * time * weight);

        if (name.equals(cycle)) {
            System.out.println("칼로리 소모: " + kcal1);
        }
        if (name.equals(walk)) {
            System.out.println("칼로리 소모: " + kcal2);
        }
        if (name.equals(run)) {
            System.out.println("칼로리 소모: " + kcal3);
        }
    }
}


