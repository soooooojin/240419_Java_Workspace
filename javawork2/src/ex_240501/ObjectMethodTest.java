package ex_240501;

import ex_240425.Animal;

class Person {
	private String name, email;
	
	public Person(String name, String email) {
		super();
		this.name = name;
		this.email = email;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	// toString 아직 재정의 안했음. toString 메서드를 부모꺼를 사용합니다. 
	// Object 클래스의 toString 이상한 메모리 주솟값이 나와서 활용이 잘 안되니. 
	// 실제 값을 출력하는 toString 메서드 이름으로 기능만 재정의하자. 

	@Override
	public String toString() {
//		return "Person [name=" + name + ", email=" + email + "]";
		return "이름 : " + name + ", 이메일 : " + email;
	}
	
	// 방법1, Object 를 똑같은 파라미터 타입으로 재정의.
//	@Override
//	//equals 를 재정의해서, name과 , email 2개 같다면, true, 아니면 false 반환하기.
	// 담을 때 다 담을수 있다. -> 담을 때 좋다 -> 꺼낼 때, 불편하다. 
//	public boolean equals(Object obj ) { // 부모와 같은 이름의 메서드를 재정의.
//		if(obj instanceof Person) {
//		Person person = (Person)obj;

	// 방법2 , 담을 때 부터, 조건의 타입을 Person 타입만 담겠다. 
	public boolean equals(Person person) {
		if(person.getName() == this.name && person.getEmail() == this.email) {
			return true;
		}else {
			return false;
		}
	}
}

public class ObjectMethodTest {

	public static void main(String[] args) {
		Person p1 = new Person("이수진 ", "lsj@naver.com");
		Person p2 = new Person("이수진 ", "lsj@naver.com");
		Animal ani1 = new Animal();
		//Object 의 toString 메서드 임. 
		// toString 을 재정의하고 나서 출력 함. 
		String result = p1.toString();
		System.out.println("Person 의 toString 이용해서 출력한 결과 : " + result);

		// Object 의 기본 equals 비교시, 메모리 위치 주솟값 비교한다. 
		boolean p1_p2_eqauls_result = p1.equals(p2);
		System.out.println("Person 의 equals 이용해서 p1.equals(p2) 출력한 결과 : " + p1_p2_eqauls_result);

	}

}













