package conditional.ex;

public class ConditionalEx7 {
	public static void main(String[] args) {
		int x = 2;
		
		String result = (x % 2 == 0) ? "짝수" : "홀수";
		System.out.println("x = " + x + ", " + result);
		
	}

}

