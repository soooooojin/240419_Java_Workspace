package ex_240426;

public class bookTest {

	public static void main(String[] args) {
		
		book book1 = new book();
		
		book1.setBookName("해리포터와 마법사의 돌");
		book1.setBookAuthor("조앤케이 롤링");
		book1.setBookPrice("7000원");
		String[] bookSeriesList = {"해리포터와 마법사의 돌", "해리포터와 비밀의 방","해리포터와 아즈카반의 죄수","해리포터와 불의 잔",
									"해리포터와 불사조의 기사단","해리포터와 혼혈왕자", "해리포터와 죽음의 성물"};
		
		System.out.println("책 제목 : " + book1.getBookName() + "\n" + 
							"작가 : " + book1.getBookAuthor() + "\n" +  
							"정가 : " + book1.getBookPrice());
		
		for (int i = 0; i < bookSeriesList.length; i++) {
			String string = bookSeriesList[i];
			System.out.println("리스트 : " + bookSeriesList[i] );	
		}
		
		
		System.out.println("선생님 미니 실습(제출 완료)==============================================================");
				
		book bookArray[] = new book[3];
		
		bookArray[0] = new book("해리포터와 마법사의 돌","조앤케이 롤링","7000원");
		bookArray[1] = new book("해리포터와 비밀의 방","조앤케이 롤링","9000원");
		bookArray[2] = new book("해리포터와 아즈카반의 죄수","조앤케이 롤링","8000원");
		
		for (int i = 0; i < bookArray.length; i++) {
			book book = bookArray[i];
			System.out.println(book);
			
		}
		
	}

}
