package ex_240430;

import javax.lang.model.element.NestingKind;

public class RiceRiceNoodle implements RiceNoodle {

	// 쌀쌀국수
	
	@Override
	public void boiledNoodle(String boiledTime) {
		System.out.println("물을 " + boiledTime + "분 동안 끓이기");
		
	}

	@Override
	public void addTopping(String[] ToppingSource) {
		for (int i = 0; i < ToppingSource.length; i++) {
			System.out.println("토핑 추가 " + (i+1)  + " : " + ToppingSource);
		}
	}

	@Override
	public void makesoup(String[] Soupsource) {
		for (int i = 0; i < Soupsource.length; i++) {
			System.out.println("육수 선택 " + (i+1)  + " : " + Soupsource);
		}
	}

	@Override
	public void makeSource(String[] Sources) {
		for (int i = 0; i < Sources.length; i++) {
			System.out.println("양념 선택 " + (i+1)  + " : " + Sources);
		}
	}

	@Override
	public void selectNoodleSize(int selectNoodleSizeNumber) {
		if (selectNoodleSizeNumber == 1) {
			System.out.println("가는 면으로 할게요.");
		} else {
			System.out.println("굵은 면으로 할게요.");
		}
	}

	

}





















