package ex_240430;

public interface Noodle {
	//면류, 
	//구성품 1)상수 2) 추상메서드 3) private 4) default 5) static 메서드
	
	public final static String NOODLENAME = "면류음식" ;
	
	//기능 
	// 1) 면 삶기 
	public abstract void boiledNoodle(String boiledTime);
	// 2) 토핑추가 
	public abstract void addTopping(String[] ToppingSource);
	// 3) 육수만들기
	public abstract void makesoup(String[] Soupsource);
	// 4) 양념만들기
	public abstract void makeSource(String[] Sources);

	

}
