package ex_240424;

import java.awt.Menu;
import java.util.Scanner;

public class Ope_menu_case {

	public static void main(String[] args) {
		
		System.out.println("증감이 연산자 앞뒤에 따른 결과 확인.");
		int a= 1;
		int b= ++a;
		System.out.println("앞 증가 b: " + b);
		
		int c =1;
		int d= c++;
		System.out.println("뒤 증가 d: " + d);
		
		System.out.println("참거짓");
		int x =5;
		int y =3;		
		int big =(x>y)?x:y;
		System.out.println((x>y)?x:y);
		
//   ------------------------------------------------------------		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("오늘 점심메뉴 무엇을 먹을까요?");
		System.out.println("오늘 날씨가 어떤가요? : ");
		int weather = scanner.nextInt();
		String menu ;
		
		char weather1 = '3';
		switch (weather1) {
		case '1': 
			System.out.println("삼선우동");
			menu = "삼선우동";
			 break;
		case '2' : 
			System.out.println("밀면");
			menu = "밀면";
			break;
		case '3': 
			System.out.println("된장찌개");
			menu = "된장찌개";
			 break;
		case '4': 
			System.out.println("돼지국밥");
			menu = "돼지국밥";
			 break;
		default:
			System.out.println("기타");
			menu = "기타";
		}
		
		System.out.println("오늘은 맑음이니 " + menu + "추천드려요.");
		scanner.close();

	}
	
}





















