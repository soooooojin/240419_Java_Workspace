package ex_240430;

public interface RiceNoodle extends Noodle {
	// 면류 인터페이스를 상속받은 쌀국수 인터페이스
	
	public final static String PRICE = "기본 8000원";
		
	//쌀국수만의 기능
	// 면 굵기 선택
	public abstract void selectNoodleSize(int selectNoodleSizeNumber);
	
	
//	//고수 추가하기
//	public abstract void addGosu();
//	//	
	
	
	}
