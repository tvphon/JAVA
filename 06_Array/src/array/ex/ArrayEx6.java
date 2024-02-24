package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
		int count = sc.nextInt();
		int[] numbers = new int[count];
		int miniNumber, maxNumber;
		
		System.out.println(count + "개의 숫자를 입력하세요 : ");
		for(int i = 0;i < count;i++) {
			numbers[i] = sc.nextInt();
		}
		
		miniNumber = numbers[0];
		maxNumber  = numbers[0];
		for(int i = 0; i < count; i++) {
			if(numbers[i] < miniNumber) {
				miniNumber = numbers[i];
			}
			if(numbers[i] > maxNumber) {
				maxNumber = numbers[i];
			}
			
		}
		System.out.println("가장 작은 정수 : " + miniNumber);
		System.out.println("가장 큰 정수 : " + maxNumber);
		
	}

}
