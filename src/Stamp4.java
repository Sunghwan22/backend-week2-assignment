import java.util.Scanner;

public class Stamp4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Score: ");
        int Score = scanner.nextInt();

        String grade = "F";

        if (Score >= 96 && Score <= 100) {
            grade = "A";
        }
        if (Score >= 91 && Score <= 95) {
            grade = "B";
        }
        if (Score >= 86 && Score <= 90) {
            grade = "C";
        }
        if (Score >= 81 && Score <= 85) {
            grade = "D";
        }
        System.out.println("grade: " + grade);
    }
}

