package study;

public class StarFive {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {			//첫번째for문 (별5줄출력을 위한 범위설정)
			for(int j=0; j<i+1; j++){		//두번째for문(별이 1개씩 증가하도록 범위설정
				System.out.print("* ");		//두번째for문의 조건충족시 실행문장
			}System.out.println();			//두번째for문의 조건불충족시 실행문장
		}
		
	}
	
}
