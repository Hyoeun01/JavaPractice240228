package ex_practice;

public class Ex_chapter03_No7 {

	public static void main(String[] args) {
		// 7. 1부터 99까지, 369 게임에서 박수를 쳐야하는 경우를 순서대로 화면에 출력하는 프로그램 작성 : for문과 여러 조건문 연습
		
		// second == 0 인경우를 계산안해서 오류가 생겼다
		
		System.out.println("369게임에서 박수를 치는경우 출력하기");
		
		for(int i = 1; i < 100 ; i++) {
			
			int first = i/10;
			int second = i%10;
			
			if(i<10) {
				if(second % 3 == 0) {
					System.out.println(i+" 박수한번");
				}
			} else {
				if(first % 3 == 0 && second % 3 == 0 && second != 0)
				{
					System.out.println(i+" 박수두번");
				}
				if(first % 3 != 0 && second % 3 == 0 && second !=0) {
					System.out.println(i+" 박수한번");
				}
				if(first % 3 == 0 && second % 3 != 0 && second !=0) {
					System.out.println(i+" 박수한번");
				}
				if(first % 3 == 0 && second == 0) {
					System.out.println(i+" 박수한번");
				}
					  			
			}
			
		
			
			
		}
	}

}
