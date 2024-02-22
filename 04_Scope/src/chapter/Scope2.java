package chapter;

public class Scope2 {
	public static void main(String[] args) { 
		int m = 10;	// m이라는 변수 생존
		for(int i = 0; i < 2; i++) {	// 블록 내부, for문 내 i라는 변수 생존
			System.out.println("for m = " + m);
			System.out.println("for i = " + i);
		} // i라는 변수 생존 종료
		
	//	System.out.println("main i = " + i);	//오류, i에 접근 불가 //오류로인한주석
		System.out.println("main m = " + m);
	} // m이라는 변수 생존 종료
}

