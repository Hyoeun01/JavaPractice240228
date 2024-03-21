package ex_240321_test;

import java.util.HashMap;
import java.util.Scanner;

public class Drinks_hashmap {

	public static void main(String[] args) {
		HashMap<String, Integer> drinks = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		
		drinks.put("밀키스", 700);
		drinks.put("코카콜라", 800);
		drinks.put("펩시", 1000);
		drinks.put("칠성사이다", 1200);
		
		System.out.println("밀키스, 코카콜라, 펩시, 칠성사이다 있습니다");
		
		while(true) {
					
			System.out.print("선택 >> ");
			String input = scanner.nextLine();
			
			if(input.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			if (drinks.containsKey(input)) {
				int value = drinks.get(input);
				System.out.println(input+"는 "+value+"원 입니다.");
			} 
	}
		scanner.close();
}
	
}