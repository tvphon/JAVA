package chapter;

public class Continue1 {
	public static void main(String[] args) {
		int i = 1;
		
		while(i <= 5) { //while(1는 5보다 작거나 같다.)참이므로 while문 코드 실행
			if(i==3) {	//if문을 만나서 (1과 3은 같다)거짓이므로 실행을안함
				i++;
				continue;
			}
			System.out.println(i); //이쪽으로와서 출력실행
			i++;				   // i = 1+1 → i = 2 가되고 다시 while 조건식으로 이동
		}
	}

}
