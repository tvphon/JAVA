package chapter2;

public class Variable5 {
	
	public static void main(String[] args) {
		//1. 변수 선언, 초기화 각각 따로
		int a;
		a = 1;
		System.out.println(a);
		
		//2. 변수 선언과 초기화 한번에
		int b = 2;			//int b를 사용해서 변수 b를 만들고 그 다음에 바로 b = 2를 사용해서 변수 b에 값 2를 저장한다.
		System.out.println(b);
		
		//3. 여러 변수 선언하면서 초기화도 동시에 진행
		int c = 3, d = 4; 
		System.out.println(c);
		System.out.println(d);
	}

}
