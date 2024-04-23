package ex_240419;

public class SportsLike {

	public static void main(String[] args) {
		System.out.println("내가 좋아하는 스포츠");
		
		Swimming sportsName = new Swimming("수영", 1, "summer");
		
		System.out.println("sportsName : " + sportsName.getSportsName());
		System.out.println("sportsMember : " + sportsName.getSportsMember());
		System.out.println("sportsSeason : " + sportsName.getSportsSeason());

		String test = Swimming.freeStyle();
		System.out.println("test 변수에 담긴 내용 출력 : " + test);
		
		System.out.println(Swimming.swimmingStyle);
//		System.out.println(sportsName.toString()); 
//		toString을 써도 되지만 memory에 기억되기 때문에 생략가능
	}

}
