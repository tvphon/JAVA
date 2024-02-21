package chapter;

public class Operator12 {
	
	public static void main(String[] args) {
		// && : AND(그리고) 연산
		System.out.println("===&& : AND 연산===");
		System.out.println(true && true);		//true   //두 항이 모두 참이어야 true를 반환
		System.out.println(true && false);		//false  //둘중 하나라도 거짓이면 false를 반환
		System.out.println(false && false);		//false	 //두 항이 모두 거짓이라 false를 반환
		
		// || : OR(또는) 연산
		System.out.println("===|| : OR 연산===");
		System.out.println(true || true);		//true   //두 항이 모두 참이라 true를 반환
		System.out.println(true || false);		//true	 //둘중 하나라도 참이면 true를 반환
		System.out.println(false || false);		//false	 //두 항이 모두 거짓이라 false를 반환
		
		// !(부정) 연산
		System.out.println("===! 연산===");
		System.out.println(!true);				//false	 //!가 부정이므로 true의 부정 false를 반환
		System.out.println(!false);				//true	 //!가 부정이므로 false의 부정 true를 반환
		
		// 변수 활용
		System.out.println("===변수 활용===");
		boolean a = true;
		boolean b = false;
		System.out.println(a && b);				//false	 //true && false
		System.out.println(a || b);				//true	 //true || false
		System.out.println(!a);					//false	 //!true
		System.out.println(!b);					//true	 //!false
	}

}
