package chapter;

public class Repetitive6 {

	public static void main(String[] args) {
		int sum = 0;
		int endNum = 3;
		
		for (int i = 1; i <= endNum; i++) {
			sum += i;
			System.out.println("i=" + i + " sum=" + sum);
		}
	}

}
