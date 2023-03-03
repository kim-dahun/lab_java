package edu.java.conditional01;

public class ConditionalMain01 {

	public static void main(String[] args) {
		// 조건문(conditional statement) 
		
		int number = 0;
		if (number > 0) { // if 뒤에 세미콜론 ; 이 들어가면 조건식에 따른 실행문이 아닌 조건식 관계없이 실행문 발동
			System.out.println("양수"); // 조건식이 참일때 실행할 문장(들).
			
		}
		
		if(number%2 == 0) {
			System.out.println("해당 값은 짝수입니다.");
		}
		
	
		
		else {
			System.out.println("해당 값은 홀수입니다.");
		}
		
		int con1 = 0;
		 if ( number > con1) { // 조건문은 입력된 순서대로 조건을 확인하여 만족하는 조건까지 점프함
			 System.out.println("양수");
		 } else if ( number < con1 ) {
			 System.out.println("음수");
		 } else {
			 System.out.println("양수도 음수도 아닌 수");
		 }

		System.out.println("====프로그램 끝====");
	}

}
