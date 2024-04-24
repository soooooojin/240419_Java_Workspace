package ex_240424;

public class NestedForTest {

	public static void main(String[] args) {
		//구구단 출력해보기
		for (int i=1; i<10; i++) {
			for(int j=1 ; j<10; j++) {
				//줄넘김 없이 가로로 출력됨
				System.out.print(i+"*"+ j +"=" + i*j);
				System.out.print("\t");
			}
			//첫번째 for문 안에서 실행2
			System.out.println();
			
		}
	}

}
