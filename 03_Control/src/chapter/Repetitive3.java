package chapter;

public class Repetitive3 {
	public static void main(String[] args) {
		int count = 0;									
		
		while(count < 3) {								//while( 0은 3보다 작다 ) 참이므로 실행 
			count++;									//count = 0 + 1 → count = 1
			System.out.println("현재 숫자는 : " + count);	//출력 → 현재숫자는 : 1
														//다시 조건식으로 돌아간다.
		}
	}

}
