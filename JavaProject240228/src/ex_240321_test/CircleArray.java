package ex_240321_test;

/* 원을 표현하는 클래스 Circle클래스를 활용하여, Circle 객체 배열을 생성하고,
*  사용자로부터 4개의 반지름을 입력받아 배열에 저장한 뒤, 배열을 검색하여
* 원 면적의 합을 출력하는 main()메소드를 가진 CircleArray 클래스 작성하기 */

import java.util.Scanner;

class Circle {
	public static int length;
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*3.14;
	}
}

public class CircleArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Circle []circle = new Circle[4];
		
		for (int i = 0; i < circle.length; i++) {
			
            System.out.print((i+1)+" 반지름 >>");
            
            int radius = scanner.nextInt();
            
            circle[i] = new Circle(radius);
            
        }
		System.out.println("저장하였습니다... ");
		
		double totalArea = 0;
		
		for ( int i = 0; i < circle.length ; i++) {
			totalArea += circle[i].getArea();
		}
		System.out.println("원의 면적 전체 합은 " + totalArea );
		scanner.close();
	}

}
