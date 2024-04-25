package ex_240424;

public class ArrayTest3 {

	public static void main(String[] args) {
		// 문자열 을 담는 배열 선언 
		String[] foodMenu = new String[5];
		
		// 더미로 넣은 데이터를, 콘솔에서, 입력을 받아서, 배열에 담아주세요.
		foodMenu[0] = "된장찌개";
		foodMenu[1] = "돼지국밥";
		foodMenu[2] = "제육볶음";
		foodMenu[3] = "불고기";
		foodMenu[4] = "비빔밥";
		
		for (int i = 0; i < foodMenu.length; i++) {
			System.out.println("수진이가 좋아하는 점심 메뉴 : " + foodMenu[i]);
		}

	}

}
