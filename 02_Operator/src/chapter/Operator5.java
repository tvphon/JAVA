package chapter;

public class Operator5 {
	public static void main(String[] args) {
		//전위 증감자
		int a = 1;
		int b = 0;
		b = ++a; 										// a의 값을 먼저 증가시키고, 그 결과에 b에 대입
		System.out.println(" a = " + a + ", b = " + b);	// 결과 : a = 2, b = 2
		
		//후위 즘감자
		a = 1;		// a 값을 다시 1로 지정
		b = 0;		// b 값을 다시 0으로 지정
		b = a++;										// a의 현재 값을 b에 먼저 대입하고, 그 후 a 값을 증가 시킴
		System.out.println(" a = " + a + ", b = " + b);	// 결과 : a = 2, b = 1
	}

}
