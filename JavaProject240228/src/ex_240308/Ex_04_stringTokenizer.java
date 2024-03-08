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

	}

}
