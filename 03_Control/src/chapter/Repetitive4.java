package chapter;

public class Repetitive4 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		int endNum = 3;
		
		while(i <= endNum) {	//while(1은 3보다 작거나같다.)참이므로 while문 코드실행
			sum += i;			// sum = 0 + 1; → sum = 1
			System.out.println("i=" + i + " sum=" + sum);	//출력 → i=1 sum=1;
			i++;				//i = 1+1; → i = 2
								//다시 조건식으로 돌아간다.
		}
	}

}
