package chapter;

public class Conditional3 {

	public static void main(String[] args) {
		int age = 14;
		
		if(age <= 7) {						// 만약 14가 7보다 크거나같다. 거짓 코드블록 실행안됨
											// ~ 7
			System.out.println("미취학");		
		}
		if(age >= 8 && age <= 13) {			// 만약 14가 8보다 크거나같거나 14가 13보다 작거나 같다. 거짓 코드블록 실행안됨
											// 8 ~ 13
			System.out.println("초등학생");
		}
		if(age >= 14 && age <= 16) {		// 만약 14가 14보다 크거나같거나 14가 16보다 작거나 같다. 참 코드블록 실행됨
											// 14 ~ 16
			System.out.println("중학생");
		}
		if(age >= 17 && age <= 19) {		// 만약 14가 17보다 크거나같거나 14가 19보다 작거나 같다. 거짓 코드블록 실행안됨
											// 17 ~ 19
			System.out.println("고등학생");
		}
		if(age >= 20) {						// 만약 14가 20보다 크거나 같다. 거짓 코드 블록 실행안됨
											// 20 ~
			System.out.println("성인");
		}
	}

}
