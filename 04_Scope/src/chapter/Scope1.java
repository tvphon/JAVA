package chapter;

public class Scope1 {
	public static void main(String[] args) { // m이라는 변수 생존 시작
		int m = 10;
		if(true) {			
			int x = 10;   // x라는 변수 생존 시작
			System.out.println("if m = " + m); 	//블록내부에서 블록 외부는 접근 가능
			System.out.println("if x = " + x);
		}	// x라는 변수 생존 종료
		
//		System.out.println("main x = " + x);	// 오류, 변수 x에 접근 불가	//오류 때문에 주석처리
		System.out.println("main m = " + m);
	} // m이라는 생존 종료

}
