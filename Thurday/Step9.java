import java.util.Scanner;

public class Step9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("적금 이자 계산기");

        System.out.print("월 적립액을 입력해주세요(원)");
        int accumulate = scanner.nextInt();
        System.out.print("적금 기간을 입력해주세요(년)");
        int year = scanner.nextInt();
        System.out.print("연 이자율을 설장해주세요(%)");
        double interestrate = scanner.nextDouble();


        int totalprincipal = accumulate * (year * 12);
        System.out.println("원금합계: " + totalprincipal);


    }
}
