package ex_240510_TEST;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = null;
		
		while(true) {
			System.out.print(">>");
			s = sc.nextLine();
			
			if(s.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			
			StringTokenizer st = new StringTokenizer(s, " ");
			int n = st.countTokens();
			System.out.println("어절 개수는 " + n);
		}
	}
}
