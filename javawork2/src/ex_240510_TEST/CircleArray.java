package ex_240510_TEST;

import java.lang.reflect.Array;
import java.util.Scanner;

public class CircleArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Array[] arr = new radius[4];
		int sum = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+ "반지름 >>");
			arr[i] = new Array(scanner.nextInt());
		}

	}

}
