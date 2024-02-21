package chapter2;

public class Variable8 {

	public static void main(String[] args) {
		//정수
		byte b = 127; 					//1byte //2^8   //-128 ~ 127 
		short s = 32767; 				//2byte //2^16  //-32,786 ~ 32,767
		int i = 2147483647; 			//4byte //2^32  //-2,147,483,648 ~ 2,147,483,647(약 20억) -2로시작하는 10자리
		
		long l = 9223372036854775807L; 	//8byte //2^64  //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807  -9로시작하는 19자리
										//int의 범위를 넘어가면 long을 써야하는데 L를 붙여 정수리터널을 long으로 변경해야한다. 소문자를 써도 상관없는데 1과 착가할수있어서 권장하지않음
		
		//실수
		float f = 10.0f;				//4byte //2^32	//-3.4E38 ~ 3.4E38, 7자리 정밀도		//
		double d = 10.0;				//8byte //2^64  //-1.7E308 ~ 1.7E308, 15자리 정밀도		//
	}
}
