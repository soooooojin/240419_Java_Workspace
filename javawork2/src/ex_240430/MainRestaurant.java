package ex_240430;

import utill.RandomSelectNumber;

public class MainRestaurant {

	public static void main(String[] args) {
		RiceRiceNoodle lSJ = new RiceRiceNoodle();
		System.out.println("이수진 쌀국수 만들기");
		
		lSJ.boiledNoodle("5");
		// 토핑 재료 추가
		String[] toppingSource = {};
		lSJ.addTopping(toppingSource);
		
		//국물 재료 추가
		String[] soupSource = {};
		lSJ.makesoup(soupSource);
		
		//양념 재료 추가
		String[] source = {};
		lSJ.makeSource(source);		
		
		//면 1.가는 면 2.굵은 면
		lSJ.selectNoodleSize(1);
		
		System.out.println("쌀쌀국수 완성");
		
		// 시식 
		String[] eatMembers = {};
		
		//랜덤하게, 멤버 한 명 선택해서 먹기
		//utill, 패키지, 자주 사용하는 기능들 모아두기
		//RandomSelectNumber, 메서드 명  : selectInt
		int selectedNumberofMember = RandomSelectNumber.selectInt(7);
		System.out.println("시식할 사람은 : " + eatMembers[selectedNumberofMember]+ "당첨");
	}

}
