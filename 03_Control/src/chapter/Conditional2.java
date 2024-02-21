package chapter;

public class Conditional2 {

	public static void main(String[] args) {
		int num = 3;

		// if 조건이 참이때 실행 else 만족하는 조건이 없을때 실행
		if (num % 2 == 0) {							// 만약((3 % 2)는 0과 같으면 참 다르면 거짓)	//3 % 2는 1이므로 거짓이다
			System.out.println("짝수");				// 거짓이므로 이 코드는 실행을 않한다
			
		} else {									// 위 if문 코드 블록이 실행을 안했으므로 else문의 코드 블록이 실행		
			System.out.println("홀수");				// 홀수
		}

	}

}
