package edu.java.variable03;

public class VariableMain03 {

	public static void main(String[] args) {
		// 문자(character) : 문자 1개. 자바에서는 작은 따옴표를 사용해야 함
		// - 컴퓨터는 문자를 저장할 때, 문자에 해당하는 코드값 ( 정수 ) 을 저장.
		// 문자열(String) : 문자들의 배열. 큰 따옴표 사용.
		
		char ch1 = 'a'; // 문자 a 의 코드값을 정수로 저장.
		System.out.println(ch1); // char타입 변수 ch1 에 저장된 값을 문자로 출력
		System.out.println((int) ch1); // char타입 변수 ch1 에 저장된 값을 정수로 출력
		
		char ch2 = 98;
		System.out.println(ch2);
		
		char ch3 = '밥';
		System.out.println((int) ch3); // Casting => 강제 타입 변환. 
		System.out.println(ch3);
		
		String str1 = "나는\n \"자바\" \n를 좋아합니다";
		System.out.println(str1);
		
		int n1 = 13;
		int n2 = 12;
		
		if(n1>n2) {
			System.out.println(n1 + " 은 " + n2 + " 보다 큽니다.");
		}
		else{
			System.out.println(n1 + " 은 " + n2 + " 보다 작습니다.");
		}

	}

}
