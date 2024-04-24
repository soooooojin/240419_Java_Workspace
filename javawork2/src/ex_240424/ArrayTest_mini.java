package ex_240424;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayTest_mini {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String intArray[] = new String[5];
		int max = 0;
		System.out.println("메뉴 5개 입력 해주세요.");
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.next();
		}
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("/  " + intArray[i]);
		}
		
		scanner.close();
	}

}
