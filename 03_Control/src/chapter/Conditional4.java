package chapter;

public class Conditional4 {

	public static void main(String[] args) {
		int age = 14;

		if (age <= 7) { 					// 만약 14가 7보다 작거나같다. 거짓 코드블록 실행안됨 		 // ~7
			System.out.println("미취학");
		} else if (age <= 13) {				// 그렇다면 만약 14가 13보다 작거나같으다. 거짓 코드블록 실행안됨 // 8 ~ 13
			System.out.println("초등학생");
		} else if (age <= 16) {				// 그렇다면 만약 14가 16보다 작거나같으다. 진실 코드블록 실행되고 // 8 ~ 13
											// if문 밖으로 나감
			System.out.println("중학생");			
		} else if (age <= 19) {				// 앞에서 참이 나와서 실행안함
			System.out.println("고등학생");
		} else {							// 앞에서 참이 나와서 실행안함
			System.out.println("성인");
		}
	}

}
