package chapter;

public class Operator3 {

	public static void main(String[] args) {
		int a = 0;
		
		a = a + 1;
		System.out.println(" a = " + a);		//1
		a = a - 1;
		System.out.println(" a = " + a);		//0
		
		//증감 연산자 
		++a;  									// a = a + 1 과 같다. 저옆에 코드를 줄여서 쓰기위해서 만들어진 것
		System.out.println(" a = " + a);		// 1
		--a;									// a = a - 1 과 같다. 저옆에 코드를 줄여서 쓰기위해서 만들어진 것
		System.out.println(" a = " + a);		// 0
	}
}
