import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("신장(cm): ");

        double height = scanner.nextDouble();

        System.out.print("체중(kg): ");

        double weight = scanner.nextDouble();

        double bmi = weight / ((height * 0.01) * (height * 0.01));

        String result = "";

        if (18.5 >= bmi) {
            result = "저체중";
        }
        if (18.5 < bmi && 23 >= bmi) {
            result = "정상";
        }
        if (23 < bmi && 25 >= bmi) {
            result = "과체중";
        }
        if (25 < bmi) {
            result = "비만";
        }
        System.out.println("비만도 결과: " + result);
        System.out.println("BMI: " + bmi);

    }
}