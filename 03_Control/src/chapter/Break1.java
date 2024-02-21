package chapter;

public class Break1 {
	
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(true) {	//while(true) 참일때 while은 실행되는데 조건식에 true를 넣으면 항상 참이므로 무한실행 
			sum += i;
			if(sum > 10) { //만약 sum이 10보다크면 참, 거짓일때는 실행되지않음
				System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
				break;
			}
			//if문이 실행안되면 이쪽으로와서 증감하고 다시 while조건문으로 간다.
			i++;
		}
		
	}

}
