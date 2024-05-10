package ex_240510_TEST;

import java.util.Scanner;

public class PhoneManger extends Phone {

	public PhoneManger(String name, String tel, String address) {
		super(name, tel, address);
	
	}

	public static void main(String[] args) {
		System.out.println("인원수 >>");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		Phone[] P;	
		P = new Phone[a];
		
		for (int i = 0; i < P.length; i++) {
			System.out.println("이름과 전화번호(번호는 연속적으로 입력),주소 >>");
			String name = scanner.next();
			String tel = scanner.next();
			String address = scanner.next();
			
		}
		System.out.println("저장되었습니다!!");
		
		for (int j = 0; true; j++) {
			System.out.println("검색할 이름>>");
			String b = scanner.next();
			
			if (b.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			for (int i = 0; i < P.length; i++) {
				if (b.equals(P[j].getName())) {
					System.out.println(P[j].getName() + "의 번호는" + P[j].getTel() + "의 주소는" + P[j].getAddress());
					break;
				}else {
					System.out.println(b + "이 없습니다.");
					break;
				}
			}
		}
		scanner.close();

	}

}
