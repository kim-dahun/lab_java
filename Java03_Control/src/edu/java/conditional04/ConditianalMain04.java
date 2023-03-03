package edu.java.conditional04;

public class ConditianalMain04 {

	public static void main(String[] args) {
		boolean a = 1>3 && 3<4;
		boolean b = 1>3 || 3<4;
		System.out.println(a); // && And 연산자
		System.out.println(b); // || Or 연산자
		
		int score = -80;
		if (score>=0 && score <=100) {
			System.out.println("정상 점수");
		} else {
			System.out.println("비정상 점수");
		}
		
		if (score<0 || score >100) {
			System.out.println("부적절한 범위");
		} else {
			System.out.println("적절한 범위");
		}
		
		boolean running = true;
		if (running) {
			System.out.println("달리는중");
		} else {
			System.out.println("멈춤");
		} 

		if (!running) {
			System.out.println("멈춤");
		} else {
			System.out.println("달리는중");
		}
	}

}
