import java.util.Scanner;

public class Step7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //입력
        System.out.print("이용시간(분): ");

        int time = scanner.nextInt();

        System.out.print("파킹존 주차여부: ");

        String parking = scanner.next();


        int parkingfee = 1000 + 150 * time;

        if (parking.equals("O")) {
            parkingfee -= parkingfee / 10;
        }
        if (parking.equals("X")) {
            parkingfee += 3000;
        }
        System.out.println("요금: " + parkingfee + "원");
    }
}
