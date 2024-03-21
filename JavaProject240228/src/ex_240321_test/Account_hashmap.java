package ex_240321_test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/*
 * 고객의 이름과 통장 잔액을 관리하는 프로그램을 해시맵을 이용하여 작성하시오. 
 * 이 프로그램은 고객의 이름과 잔액을 누적하여 관리한다. 
 * 한 고객의 입력이 끝나면 현재까지의 모든 고객의 통장 잔액을 출력한다.
 */

public class Account_hashmap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> accounts = new HashMap<>();
		
		System.out.println("<< 통장 관리 프로그램입니다. >>");
		while(true) {
		System.out.print("이름과 금액 입력 (공백으로 구분) >> ");
		String input = scanner.nextLine();
		
		if(input.equals("exit")) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		
		String[] values = input.split(" ");
		
		String name = values[0];
		int balance = Integer.parseInt(values[1]); // 배열을 문자열로 사용했기 때문에 parseInt 사용
		
		if ( accounts.containsKey(name) ) { // 해시맵에 존재하는 이름이면
			
			int currentbalance = accounts.get(name);
			accounts.put(name, currentbalance+balance); // 잔액 누적
			
		} else {
			accounts.put(name, balance); // 존재하지 않는 이름이면 해시맵에 추가
		}
		
		for (Iterator<String> iterator = accounts.keySet().iterator(); iterator.hasNext();) {
		    String key = iterator.next();
		    System.out.print("( " + key + " > " + accounts.get(key)+" )");
		   
		}  System.out.println();


	}
		scanner.close();
	}
		

}

