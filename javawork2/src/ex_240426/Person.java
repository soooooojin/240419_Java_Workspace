package ex_240426;

public class Person {
	
	//인스턴스
	private String name;
	private String age;
	private String[] habbies;
	
	
	//getter/setters
	public String getName() {
		return name;
	}
	
	public String getAge() {
		return age;
	}
	
	public String[] getHabbies() {
		return habbies;
	}
	
	
	//말하기
	public void speak() {
		System.out.println("Hello:)");
	}
	// 걷기 
		public void walk() {
			System.out.println("walk:)");
		}
	//먹기
	public void eat() {
		System.out.println("yumyum:)");
	}
	//잠자기
	public void sleep() {
		System.out.println("good night:)");
	}
	

}
