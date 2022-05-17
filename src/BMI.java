import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          //신장입력
        System.out.print("신장(cm): ");

        double 신장 = scanner.nextInt();
          //체중입력

        System.out.print("체중(kg): ");

        double 체중 = scanner.nextInt();

       System.out.print("비만도 결과: ");
       double result2 = (신장*0.01) * (신장*0.01);
       double BMI = 체중 / result2;
        if(BMI<=18.5) {
            System.out.println("저체중 ");}

        if(18.5<BMI && BMI<=23) {
            System.out.println("정상");}

        if(23<BMI && BMI<=25){
            System.out.println("과체중 ");}

        if(25<BMI){
            System.out.println("비만 ");}

       System.out.print("BMI: "+ BMI  );




    }





    }