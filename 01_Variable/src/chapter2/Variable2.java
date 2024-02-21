package chapter2;

public class Variable2 {
	public static void main(String[] args) {
		int a; //변수 선언  //숫자 정수(int)를 보관할 수 있는 이름이 a라는 데이터 저장소를 만든다.  //이것을 변수라고함 //이제 변수 a에는 숫자 정수를 보관가능 
		       //숫자 정수 뿐만 아니라 문자,소수와 같이 다양한 종류 값을 저장할 수 있는 변수들이 있지만 이번에는 숫자 정수를 저장하는 int를 씀 
		
		a = 10; //변수 초기화 : 선언한 변수에 처음으로 값을 대입해서 저장하는 것 //숫자를 보관할 수 있는 데이터 저장소인 변수 a에 값 10을 저장
		
		System.out.println(10);		//변수에 저장되어 있는 값을 읽어서 사용하는 방법은 간단하다. 변수 이름을 적어주기만 하면 된다
		System.out.println(10);		//변수 a에 10이 들어가 있다면 자바는 실행 시점에 변수의 값을 읽어서 사용한다
		System.out.println(10);		//  ▶ System.out.println(a) → 변수 a의 값을 읽음 
								    //  ▶ System.out.println(10) → a의 값인 10으로 변경, 숫자 10 출력
									//변수의 값은 반복해서 읽을 수 있다.변수의 값을 읽는다고 값이 없어지는 것이 아니다.
	}

}
