package edu.java.switch01;

public class SwitchMain01 {

	public static void main(String[] args) {
		String time = "점심";
		switch (time) { // switch 사용 시 case는 반드시 1개 이상 필요, default는 선택사항이며, 맨 밑에 작성
		case "아침":
			System.out.println("breackfast");
			//break;
		case "점심":
			System.out.println("lunch");
			//break;
		case "저녁":
			System.out.println("dinner");
			//break;
		default:
			System.out.println("dessert");
		}
		
		

	}

}
