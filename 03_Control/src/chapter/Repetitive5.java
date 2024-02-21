package chapter;

public class Repetitive5 {
	public static void main(String[] args) {
		int i = 10;
		do {										//do while문이므로 최초한번은 항상 실행
			System.out.println("현재 숫자는 : " + i);	//출력 → 현재 숫자는 : 10
			i++;									
		}while(i<3);								//i = 10 이기때문에 while(10은 3보다 작다)거짓
	}												//while문을 빠져나온다

}
