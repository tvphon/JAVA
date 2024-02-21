package chapter;

public class Operator7 {
	
	public static void main(String[] args) {
		
		// 문자열과 문자열 더하기1
		String result1 = "hello " + "world";	//"hello "문자열과 "world"문자열을 더해서 "hello world"문자열을 만든다
												//   └ 결과를 result1에 저장한다.
		System.out.println(result1);			//result1를 출력한다.
				
		// 문자열과 문자열 더하기2
		String s1 = "string1";					
		String s2 = "string2";
		String result2 = s1 + s2;				// s1과 s2 변수에 있는 문자열을 읽는다.
												// "string1" + "string2" 연산을 수행해서 "string1string2" 문자열을 만든다.
												// 결과를 result2에 저장한다.
		System.out.println(result2);			//result2를 출력한다.
		
		//문자열과 숫자 더하기1 - 문자와 숫자를 더하면 숫자를 문자열로 변경한 다음에 서로 더한다.
		String result3 = "a + b = " + 10;		//"a + b = "(String) + 10(int)			    //문자열과 숫자더하기
												//"a + b = "(String) + "10"(int → String)	//숫자를 문자열로 변경
												//"a + b = " + "10" 					    //문자열과 문자열 더하기
												//"a + b = 10"							    //결과
		System.out.println(result3);
		
		//문자열고 숫자 더하기2 - 변수가 담겨 있어도 문자와 숫자를 더하면 문자가 된다.
		int num = 20;
		String str = "a + b = ";
		String result4 = str + num;				//"a + b = "(String) + num(int)			    //str 변수에서 값 조회
												//"a + b = "(String) + 20(int)			    //num 변수에서 값 조회
												//"a + b = "(String) + "20"(int → String)   //숫자를 문자열로 변경
												//"a + b = " + "20" 						//문자열과 문자열 더하기
												//"a + b = 20" 								//결과
		System.out.println(result4);
	}

}
