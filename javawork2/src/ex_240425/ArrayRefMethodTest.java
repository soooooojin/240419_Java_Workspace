package ex_240425;

public class ArrayRefMethodTest {
	
	public static String[] makeStringArray() {
		String [] tempStringArray = new String[3];
		for (int i = 0; i < tempStringArray.length; i++) {
			tempStringArray[i] = "먹고싶은 점심메뉴" + i;
		}
		return tempStringArray;
	}
	

	public static void main(String[] args) {
		//위에서 만든 메서드를 이용, 1차원 배열 만들어서 침조형 변수 할당.
		String[] lunchMenuLSJ;
		lunchMenuLSJ = makeStringArray();
		for (int i = 0; i < lunchMenuLSJ.length; i++) {
			System.out.println("기본값 출력 : " + lunchMenuLSJ[i]);
		}
		int lunchMenuLSJMemoryAddress = System.identityHashCode(lunchMenuLSJ);
		System.out.println("lunchMenuLSJ의 메모리 위치 주소값 : " + lunchMenuLSJMemoryAddress);
		
		
		String[] lunchMenuLSJ2;
		lunchMenuLSJ2 = makeStringArray();
		for (int i = 0; i < lunchMenuLSJ.length; i++) {
			System.out.println("기본값 출력 : " + lunchMenuLSJ2[i]);
		}
		int lunchMenuLSJMemoryAddress2 = System.identityHashCode(lunchMenuLSJ2);
		System.out.println("lunchMenuLSJ의 메모리 위치 주소값: " + lunchMenuLSJMemoryAddress2);
	}
	

}
