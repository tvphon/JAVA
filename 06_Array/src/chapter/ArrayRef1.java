package chapter;

public class ArrayRef1 {
	public static void main(String[] args) {
		int[] students;				//배열 변수 선언
		students = new int[5]; 		//배열 생성
		
		
		//변수 값 대입	
		//배열은 변수와 사용법이 비슷한데, 차이점이 있다면 다음과 같이 []사이에 숫자 번호를 넣어주면 된다.
		//인덱스 : 배열의 위치를 나타내는 숫자
		students[0] = 90;
		students[1] = 80;
		students[2] = 70;
		students[3] = 60;
		students[4] = 50;
		
		//변수 값 사용
		System.out.println("학생1 점수 : " + students[0]);
		System.out.println("학생2 점수 : " + students[1]);
		System.out.println("학생3 점수 : " + students[2]);
		System.out.println("학생4 점수 : " + students[3]);
		System.out.println("학생5 점수 : " + students[4]);
	}

}
