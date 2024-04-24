package ex_240419;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("취미가 뭐예요?");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
		
		String nameString = scanner.next();
		
		System.out.println("취미 : " + nameString);

		scanner.close();
	}

}
