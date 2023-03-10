package edu.java.conditional05;

import java.util.Random;

public class ConditionalMain05 {

	public static void main(String[] args) {
		// 난수 생성 방법 ( Random number )
		
		Random random = new Random(); // Random 타입의 변수 선언 및 초기화;
		
		int x = random.nextInt(5)+1; // 0 이상 5미만의 정수 난수를 만듦.
		
		System.out.println("x = " + x);
		
		int y = random.nextInt(5)+1;
		
		System.out.println("y = " + y);
		
		// int 타입 bigger 변수에 x와 y 중에서 더 큰 수를 저장.
		
		int bigger; // 선언과 동시에 초기화 해두는 게 좋음
		
		if (x>y) {
			bigger = x;
		} else {
			bigger = y;
		}
		System.out.println("해당 값 중 더 큰 값은 " + bigger);
		
		// 삼항 연산자
		int bigger2 = (x > y) ? x : y;
		System.out.println("bigger2는 " + bigger2);
		
		// int 타입 diff 변수에 x와 y의 차이를 저장.
		
		int diff = (x>y) ? x-y : y-x;
		System.out.println("차이는 " + diff);
		
		int diff2 = 0;
		
		if ( x - y < 0) {
			System.out.println("y 가 x 보다 큽니다. 차이는");
			diff2 = y - x;
			System.out.println(diff2);
		} else {
			diff2 = x - y;
			System.out.println("x 가 y 보다 큽니다. 차이는");
			System.out.println(diff2);
		}
		
		// 10 보다 같거나 작은 정수 난수를 만들고, number에 저장.
		// String 타입 변수 evenOrOdd에 number가 짝수이면 "짝수", 홀수이면 "홀수" 라는 문자열 저장
		// 그 결과값 출력
		
		
		int number = random.nextInt(10)+1;
		System.out.println("난수는 " + number);
		String evenOrOdd = (number%2==0) ? "짝수" : "홀수";
		System.out.println("정답은 " + evenOrOdd);
		String evenOrOdd2 = (number%3==0) ? "3의 배수" : "3의 배수 아님";
		System.out.println("해당 수는 " + evenOrOdd2);
		
		String evenOrOdd3;
		
		if (number%2==0) {
			evenOrOdd3 = "짝수";
		} else {
			evenOrOdd3 = "홀수";
		}
		System.out.println(evenOrOdd3);
		
	}

}
