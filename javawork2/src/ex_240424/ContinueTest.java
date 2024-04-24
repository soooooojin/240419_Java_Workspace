package ex_240424;

import java.util.Iterator;
import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		
// ----------------------1
		Scanner scanner = new Scanner(System.in);
		
		//for 안에서 continue 확인중, 이 키워드 만나면, 디음 조건으로 넘어감.
		System.out.println("정수를 5개 입력하세요.");
		int sum=0;
		
		for (int i = 0; i < 5; i++) {
			int n = scanner.nextInt();
			//continue 확인
			if (n<0) {
				continue;
			}
			else {
				sum = sum + n;
			}
		}
		
		System.out.println("sum : " +sum);
		
// ----------------------2		
		
		Scanner scanner2 = new Scanner(System.in);
		
		//for 안에서 continue 확인중, 이 키워드 만나면, 디음 조건으로 넘어감.
		System.out.println("정수를 5개 입력하세요.");
		int sum2=0;
		
		for (int i = 0; i < 5; i++) {
			int n = scanner.nextInt();
			//continue 확인
			if (n % 2 == 0) {
				continue;
			}
			else {
				sum = sum + n;
			}
		}
		
		System.out.println("sum : " +sum2);
	}

}
