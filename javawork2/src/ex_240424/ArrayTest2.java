package ex_240424;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int intArray [] = new int[5];
		
		int max = 0;
		System.out.println("양수 5개를 입력해세요.");
		
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			if(intArray[i] > max) {
				max = intArray[i];
		}
 	}
	System.out.println("입력한 양수 5개 중 가장 큰 값은 : " + max);
	scanner.close();
	
	
	int copyArray[] = new int[5];
	
	copyArray = intArray;
	
	System.out.println("copyArray 출력해보기 ");
	for (int i = 0; i < copyArray.length; i++ ) {
		System.out.println("copyArray :" + copyArray[i]);
	}
	
	int copyArrayAddress = System.identityHashCode(copyArray);
	System.out.println("copyArray 메모리 위치 주솟값 :" + copyArrayAddress);
	
	System.out.println("intArray 출력해보기 ");
	for (int i = 0; i< intArray.length; i++) {
		System.out.println("intArray :" + intArray[i]);
	}
	
	int intArrayAddress = System.identityHashCode(intArray);
	System.out.println("copyArray 메모리 위치 주솟값: " + intArrayAddress);


	}
}