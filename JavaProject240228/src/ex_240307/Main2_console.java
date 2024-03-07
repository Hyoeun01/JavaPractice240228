package ex_240307;

import java.util.Scanner;

public class Main2_console {

	public static void main(String[] args) {
		
		//스포츠 등록하기  : 메서드로 만들기
		while(true) {
			System.out.println("=========Sports=========");
			System.out.println("번호를 입력하세요");
			System.out.println("1.스포츠 등록하기");
			System.out.println("2.등록된 스포츠 검색해서 출력");
			System.out.println("3.종료하기");
			
			//scanner
			Scanner scanner = new Scanner(System.in);
			int checkNum = scanner.nextInt();
			if(checkNum == 3) {
				System.out.println("프로그램을 종료합니다");
				// 종료시 스캐너 인스턴스 반납
				scanner.close();
				break;
			} else if(checkNum == 1) {
				// 스포츠를 등록하는메서드
				System.out.println("스포츠 등록하기");
				
			} else if(checkNum == 2) {
				System.out.println("스포츠 검색하기");
				
			} else {
				System.out.println("알림 : 1,2,3 중에서 선택하세요.");
				System.out.println();
				continue;
			}
		}

	}

}
