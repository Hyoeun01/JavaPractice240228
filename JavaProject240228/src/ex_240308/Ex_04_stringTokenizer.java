package ex_240308;

import java.util.StringTokenizer;

public class Ex_04_stringTokenizer {

	public static void main(String[] args) {
		
		String query = "name=kitae&addr=busan&age=21";
		//쿼리의 형식은 HTML의 웹브라우저에서 get 방식으로 서버에 전달하면.
		// 동적인 파라미터라고함
		StringTokenizer st = new StringTokenizer(query, "&=");
		
		int n = st.countTokens();
		System.out.println("토큰개수 = "+n);
		while(st.hasMoreTokens())
		{
			String token = st.nextToken();
			System.out.println(token);
		}
		
		String query3 = "\"apple\":\"사과\",\"banana\":\"바나나\",\"orange\":오렌지\"";
		System.out.println(query3);
		StringTokenizer st3 = new StringTokenizer(query3, ",");
		
		int n3 = st3.countTokens();
		System.out.println("토큰개수 = "+n3);
		while(st3.hasMoreTokens())
		{
			String token = st3.nextToken();
			System.out.println(token);
		}
		
	}
	
	// 전역메소드 , 입력 : StringTokenizer 타입, 단순 출력만
	
	
		
	}
	
	


