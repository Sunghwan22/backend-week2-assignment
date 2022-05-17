import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이용시간: ");

        int a = scanner.nextInt();

        System.out.print("파킹존 주차여부: ");

        String x = scanner.next();
        String b = "O";
        String c = "X";


        int price = 1000 + 150*a;
        int price2 = 4000 + 150*a;
        int price3 = 900 +  135*a;

     if(x.equals(b))
         System.out.println("요금: "+price3);
     if(x.equals(c)) {
         System.out.println("요금: "+price2);
     }

     }

     }




