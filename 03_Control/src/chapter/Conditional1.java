package chapter;

public class Conditional1 {
	public static void main(String[] args) {
		int age = 20;  								//사용자 나이		
		
		//if문은 참이면 if문 코드 블록이 실행되고 거짓이면 if문 코드 블록이 실행되지 않는다.
		if (age >= 18) {			  				// 만약 ( 20이 18보다 크거나 같다 )
													//         └(참이다)
			System.out.println("성인입니다.");			// 참이므로 성인입니다. 출력
		}
		if (age < 18) {								// 만약 ( 20이 18보다 작다 )	
			       									//		   └(거짓이다)
			System.out.println("미성년자입니다.");		// 거짓이므로 미성년자입니다. 출력안함
		}
	}

}
