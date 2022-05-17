import java.util.Scanner;

public class Exercise {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);




        System.out.print("운동 종류: ");
        String name = scanner.nextLine();

        String cycle = "자전거";
        String walk = "걷기";
        String run =  "달리기";
        System.out.print("체중(kg): ");

        int weight = scanner.nextInt();

        System.out.print("운동 시간(분): ");

        int time = scanner.nextInt();

        //  칼로리 소모량
        float per1 = (float) ((2.3/15) * weight*time);
        float per2 = (float) ((0.9/15) * weight*time);
        float per3 = (float) ((2.0/15) * weight*time);


          //종류별 칼로리 소모량
        if(cycle.equals(name)) {
            System.out.println("칼로리 소모량:"+ per1); }
        if(walk.equals(name)) {
            System.out.println("칼로리 소모량:"+ per2); }
        if(run.equals(name)) {
            System.out.println("칼로리 소모량:"+ per3); }


        }
    }







