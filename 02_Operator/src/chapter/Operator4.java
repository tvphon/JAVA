package chapter;

public class Operator4 {
	
	public static void main(String[] args) {
		int num = 10;				// 10을 2진수로 바꾸면 00001010 그러므로 num에  10(00001010)이 초기화되잇음
		System.out.println(num);	// 10
		int result = ~num;			// ~기호를 써서 num에 초기화 되잇는 값을 반전시키면 -11(11110101)이 되고 그것을 result에 초기화
		System.out.println(result);	// -11
	}

}
