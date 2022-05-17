import java.util.Scanner;

public class Testscore {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Score: ");

        int Score = scanner.nextInt();



        //score가 96이상 100이하라면 A, 91이상 95이하라면 B, 86이상 90이하라면 C, 81이상 85이하라면 D, 나머지 점수라면 F를 출력하는

        if(96<=Score && 100>=Score) {
            System.out.println("grade : A");}

            if(91<=Score && 95>=Score){
                System.out.println("grade : B"); }
            if(86<=Score && 90>=Score){
                System.out.println("grade: C ");}
            if(81<=Score && 85>=Score){
            System.out.println("grade: D ");}
            if(81>Score){
            System.out.println("grade: F ");}

                }

        }


