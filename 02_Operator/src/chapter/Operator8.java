package chapter;

public class Operator8 {
	
	public static void main(String[] args) {
		int sum1 = 1 + 2 * 3; 					// 1 + (2 * 3)과 같다. 곱셈을 먼저 계산
		int sum2 = (1 + 2) * 3;					// 연산자 우선순위를 변경할려면 수학과 마찬가지로 괄호()를 사용하면 된다.()를 먼저 계산
		System.out.println("sum1 = " + sum1);	//sum1 = 7
		System.out.println("sum2 = " + sum2);	//sum2 = 9
	}

}
