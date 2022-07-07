
import java.util.Scanner;

public class BookTest {
	public static void main(String[]args) {
		Scanner scan= new Scanner(System.in);
		BookManager bm= new BookManager();
		
		int num = 0;
		
		do {
			System.out.println("*******************");
			System.out.println("1.책 등록");
			System.out.println("2.책 삭제");
			System.out.println("3.책 리스트");
			System.out.println("4.책 검색");
			System.out.println("0.종료");
			System.out.println("*******************");
			
			num=scan.nextInt(); //사용자가 누르는 숫자 
			
			if(num==1) {
				//책 등록
				System.out.println("아래사항을 입력해주세요");
				
				System.out.println("책 제목");
				String title=scan.next();
				
				System.out.println("책 저자");
				String author=scan.next();
				
				bm.add(title, author);
			}
			if(num==2) {
				//책 삭제
				System.out.println("삭제할 책 제목을 입력해주세요");
				String title=scan.next();
				bm.remove(title);
				
			}
			if(num==3) {
			//책 리스트
				
				bm.getList();
			}
			if(num==4)//책 검색
			{
				System.out.println("검색할 책 제목을 입력하세요");
				String title=scan.next();
				bm.searchByTitle(title);
			}
		}while(num!=0);
		
		
		
	}

}
