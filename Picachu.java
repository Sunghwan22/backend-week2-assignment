import java.util.Scanner;

public class Picachu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("피카츄: 라이츄를 만났다.. ");
        System.out.println("저 자식.... 한태 한번 당한 경험이 있으 ..");
        System.out.println("이번 리벤지 매치는 나에게 아주 중요해 ");
        System.out.println("다신 땅을 침대로 누워있을 순 없어!.. ");

        int picachuHP = 50;
        int raichuHP = 50;
        while (picachuHP <= 0 || raichuHP <= 0) {

            System.out.println("피카츄의 차례, 무엇을 할까");
            System.out.println(" 1. 공격하기 ");
            System.out.println(" 2. 상처약 섭취");

            int command = scanner.nextInt();
            int drug = picachuHP;

            if (command == 1) {
                System.out.println("지우 피카츄 몸통박치기!");
                System.out.println("-- 공격 명중! 라이츄의 에너지 10감소했다. 라이츄는 조금 아파한다.");
                System.out.println("라이츄 : 앗 아프다! ");
                picachuHP -= 15;
            }
            if (command == 2) {
                System.out.println("피카츄: 얌얌 상처약 얌얌");
                System.out.println("--상처약을 섭취하여 피카츄의 에너지가 50이 되었. 피카츄는 회보되어보인다");
                System.out.println("라이츄: 킁");
                picachuHP += 50 - picachuHP;
            }


            if (raichuHP <= 0) {
                System.out.println("피카츄의 승리");
            }
            if (picachuHP <= 0) {
                System.out.println("피카츄의 패배...이변은 없었다...역사는 반복된다");
            }
        }
    }
}