package edu.java.variable04;

import java.util.Scanner;

public class VariableMain04 {

	public static void main(String[] args) {
		// 계산기 만들기 ( 콘솔창에서 키보드로 정수를 입력받아서 변수에 저장하는 방법 )
		// 1. Scanner 타입의 변수를 선언하고 초기화
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력>>>");
		
		// 2. Scanner 객체를 사용해서 콘솔 창에서 정수를 입력받고 변수에 저장.
		
		int x = sc.nextInt();
		System.out.println("X : " + x);
		
		System.out.println("두번째 정수를 입력>>>");
		
		int y = sc.nextInt();
		System.out.println("Y : " + y);
		// y에 입력받은 변수 저장
		// x + y , x - y , x * y , x / y, x % y 결과를 출력
		// 사칙연산의 결과를 저장할 변수를 선언
		int result;
		
		result = x + y; // 오른쪽 계산식이 모두 종료된 다음 마지막으로 등호(저장) 연산자 발동
		System.out.println("더하기 : "+ result);
		
		result = x - y;
		System.out.println("빼기 : " + result);
		
		result = x * y;
		System.out.println("곱하기 : " + result);
		
		result = x / y;
		System.out.println("나누기의 몫 : " + result); 
		// 나누기 연산자 :
		// 1. (정수) / (정수) = 나눈 몫
		// 2. (실수) / (실수) = 소수점까지 나누기 계산
		// (실수) / (정수) 또는 (정수) / (실수) 도 2번과 상동
		
		result = x % y;
		System.out.println("나누기의 나머지 : " + result); // % 는 실수의 연산에서는 사용하진 않음. 정수에서만
		
		System.out.println("계산방식을 선택하세요.\n (1:더하기 / 2: 빼기 / 3: 곱하기 / 4: 나누기 / 5:나머지)");
		int z = sc.nextInt();
		while(true) {
			
			
			if(z==1) {
				result = x + y;
				System.out.println("결과값은 " + result);
				break;
			}
			if(z==2) {
				result = x - y;
				System.out.println("결과값은 " + result);
				break;
			}
			if(z==3) {
				result = x * y;
				System.out.println("결과값은 " + result);
				break;
			}
			if(z==4) {
				result = x / y;
				System.out.println("결과값은 " + result);
				break;
			}
			if(z==5) {
				result = x % y;
				System.out.println("결과값은 " + result);
				break;
			}
			else if(z > 5){
				System.out.println("잘못된 입력값 입니다.");
				z=sc.nextInt();
				
			}
			continue;
				
			
		}
		
		
		
		
		
	}
	
	

}
