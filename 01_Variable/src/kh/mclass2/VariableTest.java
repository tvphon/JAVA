package kh.mclass2;

import java.util.Date;    //java.util에서 만든설계도를 쓸꺼다

public class VariableTest {
	public static void main(String[] args) {
		// 자료형 = Type = Class명
		// 기본자료형(primitive type) 8개 기본적으로 크기를 정해둠
		      // boolean char byte Short ★int long float ★double 
		// 참조 자료형 (reference type) 1개(String)  //기본자료형이 여러개가 묶여서 참조자료형이 된다  //틀,모형이라고도 많이한다
		int x = 256; //방크기(int)를 정해주고 선언,   x가 변수(방이름),  '='이 구분자 우변에 있는 코드를 좌변에 대입, 
		//int //2^32 4,294,967,296 // -2,147,483,648 ~ 2,147,483,647 // -2로시작하는 10자리숫자 //4byte
		byte y = 127; //2^8 256 // -128 ~ 127 //error 128 //1byte
		double z = 2.88888888888888888;  //실수형 //8byte
		double z2 = 2888888888888888.88;
//		float f1 = 3.0;		//4byte		//3.0이 쩜이 찍히는순간 임시 double(8byte)방에 넣는다		//double(8byte)은 float(4byte)에 못넣는다 
		float f1 = 3.0f; //3.0에 f를 붙이면 임시공간에 float(4byte)에 넣는다
//		float f1 = 1+3.0;	//
		double d1 = 3;
		System.out.println(d1); 	//3.0이나옴	//형변환을 시켜준다
		d1 = 1 + 3.0;	//int(4byte)방에있던 1과 3.0이라고하는 double(8byte)이라는 방을 더해달라
						//두개의 방크기가 안맞으면 두개의 방크기를 바꾸는 작업부터함
						//자료형이 다른 산술연산 시 같은 자료형으로 변형(자동)하고 산술연산함
						//int(4byte)가 double(8byte)로 바꾸는것은 가능하지만 double(8byte)을 int(4byte)로 바꾸는것은 불가능
		System.out.println(d1); 	//d1은 4.0이 나오게 된다
//		x = 1 + 3.0;	//오류남 x는 int(4byte)방이므로 1이 double(8byte)로 바뀌기때문에 x에 넣을수없다 
		f1 = (float)d1; //강제형변환, 명시적형변환
		int t1;		//자료형(int)가 나오면 자료형 다음에 있는 방만들기 먼저하고
		t1 = 10;
		t1 = 10*2;	//우변을 먼저 처리하고 좌변에 대입한다
		int t2 = 10*2+2;	//int형태로 t2방만들고 우변계산하고 좌변에잇는 t2방으로 대입		//10*2+2을 임시공간에서 계산한다
		boolean a = true;   //boolean은 true, false로 표현  //1byte
		boolean b = false;
//		boolean c = 1;  	//1또는0으로도 true,false로 표현됨
		char ch = 60; //-60은 오류, 음수는 입력이 안되기떄문
		char ch2 = 'c';  //한글자는 ''를 쓴다
		char ch3 = ch; //ch3번방에는 60이 들어있다
		// 글자색
		// 보라색 : 예약어  //예약어 다음에는 변수이름이 온다 //보라색이 들어갈 위치 알아두기
		String str = "ch";   //0자 이상이면 ""를 쓴다  //0자이상이면 String을 쓴다 
		String str2 = "c";   //한글자도 사용가능  
		String str3 = "";   //아무글자도 없어도 사용가능
		String str4 = "asdasdawdwa";   //길게도 가능	
		String str5 = "ab"+"cd";   //+는 연결자  //우변을 처리하고 대입	//세미클론(;)은 마침표
		z = x;
//		z = x + t;
//		System.out.println(z);
		Date t = new Date();                  //new 설계도가아닌 진짜 집   //참조자료형에다가 참조자료형값을 만들어냄
//		java.sql.Date t2 = new java.sql.Date(2024,01,31);
		java.util.Date t3 = new java.util.Date();                //java에서 제공해주는 시스템
		//여기까지하고 실행해보면 아무것도안나옴 이유는 대입만하고 출력을 안했기떄문임
		System.out.println(z);
		System.out.println(t3);
		//여기까지하고 출력을해보면 256.0      이렇게 출력이 된다
		//                  현재날짜가표시
	}

}
