package chapter;

public class Conditional5 {
	
	public static void main(String[] args) {
		int price = 10000;										// 아이템 가격
		int age = 10;											// 나이
		int discount = 0;										// 할인
			
		if (price >= 10000) {									// 아이템가격이 10000보다 크거나 같을때 참
			discount = discount + 1000;							// 참이므로 discount에 1000이 들어간다.
																// discount += 1000; 이렇게도 가능
			System.out.println("10000원 이상 구매, 1000원 할인");
		}
		
		if (age <= 10) {										// 나이가 10보다 작거나 같을때 참
			discount = discount + 1000;							// 참이므로 discount에 1000이 들어간다.
			System.out.println("어린이 1000원 할인");
		}
		
		System.out.println("총 할인 금액: " + discount + "원");		// 처음 if문에서 discount에 1000이들어가고
		                                                        // 처음 if문에서 discount에 1000이 들어잇는상태에서
																// 두번쨰 if문으로 넘어와서 discount(1000) + 1000임 
																// 그러므로 discount는 2000
																// else if문을 썻으면 위에서 참이나오고 바로 if밖으로나와서
																// 밑에꺼가 실행이 안되서 discount는 1000이됨
	}

}
