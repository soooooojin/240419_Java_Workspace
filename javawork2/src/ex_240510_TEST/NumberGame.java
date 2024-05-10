package ex_240510_TEST;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = (int) (Math.random() * 100 + 1);//런덤 수 만드는 객체/100까지 수만 랜덤
		int count = 1;
		
		
		System.out.println("====숫자맞추기 게임을 시작합니다.====");
		
		if (number % 2 == 0) {
		    System.out.println("힌트는 짝수입니다.");
		}else {
			System.out.println("힌트는 홀수입니다.");
		}
		
		while (true) {

			System.out.print(count + "번째 >>");
				int input = scanner.nextInt();
			
			if (input > number) {
				System.out.println("더 작은 수입니다.");
			}else if (input < number){
				System.out.println("더 큰 수 입니다.");
			}else if (input == number) {
				System.out.println("정답입니다.");
				System.out.println("===게임을 종료합니다.===");
				System.exit(0);
			}
			count++;
		}

	}

}
