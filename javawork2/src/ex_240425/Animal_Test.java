package ex_240425;

public class Animal_Test {

	public static void main(String[] args) {
//		//고양이 만들기.
//		Cat cat1 = new Cat();
//		cat1.setName("모찌");
//		cat1.setAge(2);
//		String[] catFoodList = {"츄르", "참치캔","생선"};
//		cat1.setFavoriteFood(catFoodList);
//		cat1.setPlace("정섭씨 집");
//		
//		
//		// 고양이 정보 출력하기
//		String catInformation = cat1.toString();
// 		System.out.println("고양이 정보 : " + catInformation);
//		cat1.toString();
//		// 고양이 기능 출력하기
//		cat1.moveAction("우다다 다닌다.");
//		cat1.speakSound("냐용~~");
//		System.out.println("고양이가 사는 곳 : " + cat1.getPlace());
		
		LEESOOJINbear b1 = new LEESOOJINbear();
		b1.setName("반달");
		b1.setAge(3);
		b1.setKindOf("반달가슴곰");
		b1.setColor("검은색");
		String[] bearFoodList = {"꿀", "생선","산딸기"};
		b1.setFavoriteFood(bearFoodList);
		
		String bearInformation = b1.toString();
		System.out.println("곰 정보 : " + bearInformation );
		b1.toString();
		
		b1.moveAction("쿵쿵쿵! , 투다다닥(나무타기)");
		b1.speakSound("우어어어어~~");
		System.out.println("품종 : " + b1.getKindOf());
		System.out.println("털색 : " + b1.getColor());

		
	}

}
