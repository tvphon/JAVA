package chapter;

public class Operator13 {
	
	public static void main(String[] args) {
		int a = 15;
		
		// a는 10보다 크고 20보다 작다
		boolean result = a > 10 && a < 20; 		//(a > 10) && ( a < 20 )	// 10 < a && a < 20 이렇게하면 보기편함
		System.out.println("result = " + result);
	}

}
