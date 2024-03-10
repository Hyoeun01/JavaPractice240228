package ex_practice;

public class Ex_chapter04_from_worldgame_main {
	
	/* 
	* n명이 참가하는 끝말잇기게임. 처음 단어는 "아버지"이다. n명의 참가자들은 순서대로 자신의 단어를 입력하면된다.
	* 끝말잇기에서 끝말이 틀린경우 게임을 끝내고 게임에서 진 참가자를 화면에 출력한다.
	* 
	* worldgame 클래스에는 생성자, main(), 게임을 전체적으로 진행하는 run()메소드를 둔다.
	* run() 에서는 선수숫자 만큼의 player객체를 배열로 생성한다.
	* 
	* player 클래스는 게임참가자의 이름 필드와 사용자로 부터 단어를 입력받는 getWordFromUser() 메소드, 
	* 끝말잇기의 성공여부와 게임을 계속하는지를 판별하는 checkSuccess()메소드를 둔다
	* 
	* 문자열의 마지막 문자와 첫번째 문자는 다음과 같이 알아낼 수 있다
	* String word = "아버지";
	* int lastIndex = word.length() -1; // 마지막 문자에 대한 인덱스
	* char lastChar = word.charAt(lastIndex);
	* char firstChar = word.charAt(0);
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
