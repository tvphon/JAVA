package chapter;

public class Operator6 { 
	
	public static void main(String[] args) {
		//변수 초기화
		int a = 5;
		int b = 2;
		
		// 덧셈
		int sum = a + b;	// int sum = a + b 계산 과정
//		int sum = a + b   	// 1.변수 값 읽기
//		int sum = 5 + 2		// 2. 변수 값 계산
//		int sum = 7			// 3. 계산 결과를 sum에 대입
		System.out.println(" a + b = " + sum);
		
		// 뺼셈
		int diff = a - b;
		System.out.println(" a - b = " + diff);
		
		// 곱셈
		int multi = a * b;
		System.out.println(" a * b = " + multi);
		
		//나눗셈 
		int div = a / b ;						// 5 / 2의 결과는 2.5가 되어야 하지만 결과는 소ㅈ수점이 제가된 2가 나왔다
		System.out.println(" a / b = " + div);  //   └ 자바에서 같은 int 형끼리 계산하면 계산 결과도 같은 int형을 사용한다.
												//     int형은 정수이기 떄문에 소수점 이하를 포함할 수 없다.
												// 주의1 0으로 나누기
												// 10 / 0과 같이 숫자는 0으로 나눌 수 없다.(수학에서 허용하지 않음)
												// 만약 변수 b = 0을 대입하면 5 / 0이 된다.이 경우 프로그램에 오류가 발생한다.
		
		//나머지 
		int mod = a % b;						// 나머지 연산자(%)		
		System.out.println(" a % b = " + mod);  //  └ 이름 그대로 나머지를 구하는 연산자이다.
		                                        //  └ 5 / 2 몫이 2 나머지가 1이다. 따라서 나머지 연산자 5 % 2의 결과는 1이 된다.
	}

}
