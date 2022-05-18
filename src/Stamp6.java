import java.util.Scanner;

public class Stamp6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("동물 이름: ");
        String animal = scanner.nextLine();

        String answer = "우리 농장에는 그 동물이 없습니다";

        if (animal.equals("개")) {
            answer = "멍멍";
        }
        if (animal.equals("닭")) {
            answer = "꼬꼬댁";
        }
        if (animal.equals("돼지")) {
            answer = "꿀꿀";
        }
        System.out.println(answer);
    }
}

