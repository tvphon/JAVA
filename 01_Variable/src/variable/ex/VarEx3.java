package variable.ex;
//클래스 이름을 VarEx3으로 해주세요
//long 타입의 변수를 선언하고, 그 변수를 10000000000(백억)으로 초기화한 후 출력하는 프로그램을 작성하세요.
//boolean 타입의 변수를 선언하고, 그 변수를 true로 초기화한 후 출력하는 프로그램을 작성하세요.

public class VarEx3 {
	public static void main(String[] args) {
		long l = 10000000000L;			// 정수 int가 담을수 없을 만큼 큰 10000000000(백억)의 수를 담기위헤서 long사용 L를 붙여 정수리터널을 long으로 변경
		System.out.println(l);
		boolean b = true;				//boolean은 true, false 값만 사용가능
		System.out.println(b);
		
	}

}
