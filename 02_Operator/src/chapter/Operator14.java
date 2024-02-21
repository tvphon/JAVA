package chapter;

public class Operator14 { 
	
	public static void main(String[] args) {
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';	//엄마나이는 47 아빠나이는 45 , 아빠나이는 엄마나이보다 크다(거짓), 
													//거짓이므로 식2인 'F'가 ch에 들어간다
		
		System.out.println(ch);						// F
	}

}
