import java.util.Scanner;

public class Step6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" 운동 종류: ");

        String kind = scanner.nextLine();

        boolean cycle = kind.equals("자전거");
        boolean walk = kind.equals("걷기");
        boolean run = kind.equals("달리기");


        System.out.print("체중(kg): ");

        int weight = scanner.nextInt();

        System.out.print("운동시간(분): ");

        int time = scanner.nextInt();

        double cyclekcalburn = (double) ((2.3 / 15) * time * weight);
        double walkkcalburn = (double) ((0.9 / 15) * time * weight);
        double runkcalburn = (double) ((2.0 / 15) * time * weight);

        if (cycle) {
            System.out.println("칼로리 소모: " + cyclekcalburn);
        }
        if (walk) {
            System.out.println("칼로리 소모: " + walkkcalburn);
        }
        if (run) {
            System.out.println("칼로리 소모: " + runkcalburn);
        }
        if (!cycle && !walk && !run) {
            System.out.println("지원 하지 않는 운동 종류 입니다");
        }
    }
}
