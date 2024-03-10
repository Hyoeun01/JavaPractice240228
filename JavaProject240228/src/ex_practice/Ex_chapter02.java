package ex_practice;

import java.util.Scanner;

public class Ex_chapter02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean continueFlag = true;

		while (true) {
			System.out.println("1~10중에서 선택하세요. 0 입력시 종료>>");
			int number = scanner.nextInt();

			if (number == 0) {
				continueFlag = false;
				break;
			} else if (number < 0 || number > 10) {
				System.out.println("0부터 10 사이의 숫자만 입력하세요.");
				continue;
			}

			switch (number) {

			case 1:
				int x, y, sum;
				System.out.println("정수 두개를 입력하세요>>");
				x = scanner.nextInt();
				y = scanner.nextInt();

				sum = x + y;

				System.out.println(x + " + " + y + "은 " + sum);
				break;

			case 2:

				System.out.println("몇 층인지 입력하세요 >>");

				x = scanner.nextInt();
				y = 5 * x;

				System.out.println(y + "m 입니다");
				break;

			case 3:
				System.out.println("x 값을 입력하세요 >>");

				x = scanner.nextInt();
				y = x * x - 3 * x + 7;

				System.out.println("x = " + x + ", y = " + y);
				break;

			case 4:
				System.out.println("점 (x,y)의 좌표를 입력하세요 >> ");
				x = scanner.nextInt();
				y = scanner.nextInt();

				if (x >= 50 && x <= 100 && y >= 50 && y <= 100) {
					System.out.println("점 (" + x + "," + y + ")은 (50,50)과 (100,100)의 사각형 내에 있습니다.");
				} else {
					System.out.println("점 (" + x + "," + y + ")은 (50,50)과 (100,100)의 사각형 내에 없습니다.");
				}
				break;

			case 5:
				System.out.println("논리연산을 입력하세요 >> ");

				boolean a = scanner.nextBoolean();
				String op = scanner.next();
				boolean b = scanner.nextBoolean();

				switch (op) {

				case "AND":
					boolean resultAnd = a && b;
					System.out.println(resultAnd);

					break;
				case "OR":
					boolean resultOr = a || b;
					System.out.println(resultOr);
					break;
				}
				break;

			case 6:
				System.out.println("돈의 액수를 입력하세요 >> ");
				x = scanner.nextInt();

				int fifty_thousand = 0;
				int ten_thousand = 0;
				int five_thousand = 0;
				int thousand = 0;
				int five_hundred = 0;
				int hundred = 0;
				int ten = 0;
				int one = 0;

				if (x >= 50000) {
					fifty_thousand = x / 50000;
					x = x % 50000;
				}
				if (x >= 10000) {
					ten_thousand = x / 10000;
					x = x % 10000;
				}
				if (x >= 5000) {
					five_thousand = x / 5000;
					x = x % 5000;
				}
				if (x >= 1000) {
					thousand = x / 1000;
					x = x % 1000;
				}
				if (x >= 500) {
					five_hundred = x / 500;
					x = x % 500;
				}
				if (x >= 100) {
					hundred = x / 100;
					x = x % 100;
				}
				if (x >= 10) {
					ten = x / 10;
					x = x % 10;
				}
				if (x >= 1) {
					one = x;
				}

				System.out.println("5만원 " + fifty_thousand + "개, 만원 " + ten_thousand + "개, 오천원 " + five_thousand
						+ "개, 천원" + thousand + "개, 오백원 " + five_hundred + "개, 백원 " + hundred + "개, 10원 " + ten
						+ "개, 1원 " + one + "개");
				break;

			case 7:
				System.out.println("학점을 입력하세요 >> ");
				String score = scanner.next();
				switch (score) {
				case "A", "B":
					System.out.println("Excellent");
					break;
				case "C", "D":
					System.out.println("Good");
					break;
				default:
					System.out.println("Bye");
				}
				break;

			case 8:
				System.out.println("커피를 주문하세요");
				System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼중 하나와 잔수 입력");

				String coffee = scanner.next();
				int orderNum = scanner.nextInt();

				/*
				 * if(coffee.equals("에스프레소")) { System.out.println(2000*orderNum+"원입니다"); }
				 * if(coffee.equals("아메리카노")) { System.out.println(2500*orderNum+"원입니다"); }
				 * if(coffee.equals("카푸치노")) { System.out.println(3000*orderNum+"원입니다"); }
				 * if(coffee.equals("카페라떼")) { System.out.println(3500*orderNum+"원입니다"); }
				 */

				switch (coffee) {
				case "에스프레소":
					System.out.println(2000 * orderNum + "원입니다");
					break;
				case "아메리카노":
					System.out.println(2500 * orderNum + "원입니다");
					break;
				case "카푸치노":
					System.out.println(3000 * orderNum + "원입니다");
					break;
				case "카페라떼":
					System.out.println(3500 * orderNum + "원입니다");
					break;
				}
				break;

			case 9:
				System.out.println("커피를 주문하세요");
				System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼중 하나와 잔수 입력");

				String coffee2 = scanner.next();
				int orderNum2 = scanner.nextInt();

				/*
				 * switch(coffee2) { case "에스프레소" : if(orderNum2<10) {
				 * System.out.println(2000*orderNum2+"원입니다"); } else {
				 * System.out.println((int)(2000*orderNum2*0.95)+"원입니다"); } break; case "아메리카노"
				 * : System.out.println(2500*orderNum2+"원입니다"); break; case "카푸치노" :
				 * System.out.println(3000*orderNum2+"원입니다"); break; case "카페라떼" :
				 * System.out.println(3500*orderNum2+"원입니다"); break; }
				 */
				
				  if(coffee2.equals("에스프레소")) {if(orderNum2<10)
				  {System.out.println(2000*orderNum2+"원입니다"); } else
				 {System.out.println((int)(2000*orderNum2*0.95)+"원입니다");} }
				  if(coffee2.equals("아메리카노")) { System.out.println(2500*orderNum2+"원입니다"); }
				  if(coffee2.equals("카푸치노")) { System.out.println(3000*orderNum2+"원입니다"); }
				  if(coffee2.equals("카페라떼")) { System.out.println(3500*orderNum2+"원입니다"); }
				 
			break;
			
			case 10:
				System.out.println("1~99사이의 자연수를 입력하세요");
				int n = scanner.nextInt();
				
				int first = n/10;
				int second = n%10;
				
				if(n<10) {
					if(second%3 == 0) {
						System.out.println("박수짝");
					}else {
						System.out.println("박수없음");
					}
					
				}
				else {
					if(first%3==0 && second%3==0 && second !=0) {
						System.out.println("박수짝짝");
					}
					else if(first % 3 != 0 && second % 3 == 0 && second !=0) {
						System.out.println("박수짝");
					}
					else if(first % 3 == 0 && second % 3 != 0 && second !=0) {
						System.out.println("박수짝");
					}
					else if(first % 3 == 0 && second == 0) {
						System.out.println("박수짝");
					}
					else {
						System.out.println("박수없음");
					}
				}
				
			break;	

			}
			System.out.println();

		}
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
	}
}
