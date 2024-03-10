package ex_practice;

import java.util.Scanner;

public class Ex_chapter03_No8 {

	public static void main(String[] args) {

		// 8. 컴퓨터와 사용자의 가위바위보 프로그램 작성. 사용자가 enter키를 치면 컴퓨터는 랜덤하게 가위바위보중 하나 선택.
		//	그리고 누가 이겼는지 출력한다. '그만'을 입력하면 게임 종료 : 반복문과 조건문 활용 연습
		// String str[] = {"가위", "바위" , "보"};
		// 컴퓨터가 랜덤하게 결정하기위해 int n = (int)(Math.random()*3); // 0.1.2.중에 랜덤 정수리턴, 0 = 가위 , 1 = 바위, 2 = 보 처리
		// 컴퓨터가 낸 것이 가위인지 비교하는 코드는 if(str[n].equals("가위"))
		
		Scanner scanner = new Scanner(System.in);
		String str[] = {"가위","바위","보"};
		
		while (true) {
		System.out.println("컴퓨터와 가위바위보 게임을 합니다");
		
		System.out.println("가위 바위 보 ('그만'입력시 게임종료)>> ");
		String string = scanner.next();
		

        if (string.equals("그만")) {
            System.out.println("게임을 종료합니다.");
            break;
        }
		
		int n = (int)(Math.random()*3);
		
		switch (string) {
		
		case "가위":
			if(str[n].equals(string)) 
			{System.out.println("사용자 : "+string+",컴퓨터 : "+str[n]+", 비겼습니다.");}
			if(str[n].equals("바위"))
			{System.out.println("사용자 : "+string+",컴퓨터 : "+str[n]+", 컴퓨터가 이겼습니다.");}
			if(str[n].equals("보"))
			{System.out.println("사용자 : "+string+",컴퓨터 : "+str[n]+", 사용자가 이겼습니다.");}
		break;
			
		case "바위":
			if(str[n].equals("가위"))
			{System.out.println("사용자 : "+string+",컴퓨터 : "+str[n]+", 사용자가 이겼습니다.");}
			if(str[n].equals(string))
			{System.out.println("사용자 : "+string+",컴퓨터 : "+str[n]+", 비겼습니다.");}
			if(str[n].equals("보"))
			{System.out.println("사용자 : "+string+",컴퓨터 : "+str[n]+", 컴퓨터가 이겼습니다.");}
		break;
		
		case "보":
			if(str[n].equals("가위"))
			{System.out.println("사용자 : "+string+",컴퓨터 : "+str[n]+", 컴퓨터가 이겼습니다.");}
			if(str[n].equals("바위"))
			{System.out.println("사용자 : "+string+",컴퓨터 : "+str[n]+", 사용자가 이겼습니다.");}
			if(str[n].equals(string))
			{System.out.println("사용자 : "+string+",컴퓨터 : "+str[n]+", 비겼습니다.");}
		break;	
			
		}
		System.out.println();

	}
		
}
}
