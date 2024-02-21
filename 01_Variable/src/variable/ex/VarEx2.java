package variable.ex;
//클래스 이름은 VarEx2라고 적어주세요.
//1.변수 num1을 선언하고, 이에 10을 할당하세요.
//2. 변수 num2를 선언하고, 이에 20을 할당하세요.
//3. 두 변수의 합을 구하고, 그 결과를 새로운 변수 sum에 저장하세요.
//4. sum변수의 값을 출력하세요.

public class VarEx2 {
	public static void main(String[] args) {
		int num1 = 10;			//정수형 변수 num1을 선언하고 10을 대입
		int num2 = 20;			//정수형 변수 num2를 선언하고 20을 대입
		int sum = num1 + num2;	//정수형 변수 sum을 선언하고 (num1(10)+num2(20))을 대입
		System.out.println(sum);//(num1(10)+num2(20))가 대입된 sum 출력
	}
}
