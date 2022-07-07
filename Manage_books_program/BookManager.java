
public class BookManager {
	
	int MAX_SIZE=100;
	Book[] books= new Book[MAX_SIZE];
	int size=0;
	
	// 책을 추가하는 메소드
	public void add(String title, String author) {
		Book b= new Book();
		b.setAuthor(author);	// 작가 추가
		b.setTitle(title);		// 책이름 추가
		
		books[size++] = b;		// books 배열에 차곡차곡 담는다
	}
	
	// 책을 삭제하는 메소드
	public void remove(String title) {
		System.out.println("********책 삭제********");
		for(int i=0; i<size; i++) {		// 삭제할 타이틀을 가진 Book 객체를 찾는거
			if(books[i].getTitle().equals(title)) {		// 삭제할 타이틀 가진 Book 객체를 찾으면
				for(;i<size;i++) {		// 뒤의 모든 Book 객체를 앞으로 한칸씩  땡김 (= 삭제할 Book 객체를 덮어씀으로써 삭제함)
					books[i]=books[i+1];
				}
				size--;		// 한 칸씩 다 땡겼으니까 size도 하나 줄여줌 (왜냐고? 빈방에 차곡차곡 책을 채워야하니까~)
			}
			
		}
		
	}	
	
	// 모든 책의 리스트를 출력하는 메소드
	public void getList() {
		System.out.println("********책 리스트********");
		for(int i=0;i<size;i++)
			System.out.println(books[i]);
	}
	
	// 특정 책의 정보(책이름, 작가이름)을 출력하는 함수
	public void searchByTitle(String title) {
		System.out.println("********책 검색********");
		for(int i=0; i<size; i++) {
			if(books[i].getTitle().equals(title)) {
				System.out.println(books[i]);
			}
		}
	}
	
}
