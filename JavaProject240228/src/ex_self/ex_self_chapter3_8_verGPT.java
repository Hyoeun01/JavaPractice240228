package ex_self;

import java.util.Random;
import java.util.Scanner;

public class ex_self_chapter3_8_verGPT {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("가위바위보 중 하나를 선택하세요 (가위, 바위, 보), 종료하려면 '그만'을 입력하세요:");
            String userChoice = scanner.nextLine().toLowerCase();

            if (userChoice.equals("그만")) {
                System.out.println("게임을 종료합니다.");
                break;
            }

            if (!userChoice.equals("가위") && !userChoice.equals("바위") && !userChoice.equals("보")) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                continue;
            }

            int computerChoiceNumber = random.nextInt(3); // 0: 가위, 1: 바위, 2: 보
            String computerChoice;
            switch (computerChoiceNumber) {
                case 0:
                    computerChoice = "가위";
                    break;
                case 1:
                    computerChoice = "바위";
                    break;
                case 2:
                    computerChoice = "보";
                    break;
                default:
                    computerChoice = "";
            }

            System.out.println("사용자: " + userChoice);
            System.out.println("컴퓨터: " + computerChoice);

            // 승부 결정
            if (userChoice.equals(computerChoice)) {
                System.out.println("무승부!");
            } else if ((userChoice.equals("가위") && computerChoice.equals("보")) ||
                    (userChoice.equals("바위") && computerChoice.equals("가위")) ||
                    (userChoice.equals("보") && computerChoice.equals("바위"))) {
                System.out.println("사용자 승!");
            } else {
                System.out.println("컴퓨터 승!");
            }
        }
        scanner.close();
	}

}
