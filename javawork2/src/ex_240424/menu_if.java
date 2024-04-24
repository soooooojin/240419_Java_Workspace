package ex_240424;

import java.util.Scanner;

public class menu_if {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("오늘 점심메뉴 무엇을 먹을까요?");
		System.out.println("오늘 날씨가 어떤가요? : ");
		int weather = scanner.nextInt();
		String menu ;
		
		if(weather == 1)
			//System.out.println("삼선우동");			
			menu = "삼선우동";
		else if(weather == 2)
			//System.out.println("밀면");
			menu = "밀면";
		else if(weather == 3)
			//System.out.println("된장찌개");
			menu = "된장찌개";
		else if(weather == 4)
			//System.out.println("돼지국밥");
			menu = "돼지국밥";
		else
			//System.out.println("기타");
			menu = "기타";

		System.out.println("오늘은 맑음이니 " + menu + "추천드려요.");
		scanner.close();

	}

}
