import java.util.Scanner;

public class Strange {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Megap : Input 2 Number: ");

        int a = scanner.nextInt();
        int b=  scanner.nextInt();


        System.out.print((a*0.1)+ "+" +(b*0.1)+ " = ");
        int answer = scanner.nextInt();

        System.out.println("Translation for Megap: "+ (answer*10));

    }
}
