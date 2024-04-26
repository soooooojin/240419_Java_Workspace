package ex_240426;


class Sample {
	public int a;
	private int b;
	int c;
	
	public int getB() {
		return b;
	}
	
	//전역만 확인 해보기
	static int tvChannel = 3;
	public static void channelUp() {
		tvChannel++;
	}
	public static void channelDown() {
		tvChannel--;
	}
	
}

public class AccessTest {

	public static void main(String[] args) {
		Sample sample = new Sample();
		//sample.b =3 ;
		int result = sample.getB();
		System.out.println("result : " + result);
		
		//public int a;
		//값 직접 접근이 가능해서, 읽기,쓰기도 됨
		//직접 쓰기
		System.out.println("sample a의 값 : " +sample.a);
		
		Sample LSJ = new Sample();
		Sample LSJ1 = new Sample();
		Sample LSJ2= new Sample();
		
		System.out.println("이수진이 티비를 " + LSJ.tvChannel + "번 채널 시청중");
		System.out.println("이수진이 UFC를 보고 싶어서 채널 1 올림");
		//채널 변경
		LSJ2.channelUp();
		System.out.println("이수진이 티비를 동생과 티비를 "+ LSJ.tvChannel+ " 번 채널 시청중");
		
	}

}


















