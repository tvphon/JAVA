package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];
		int sum = 0;
		double average;
		
		System.out.println(numbers.length +"개의 정수를 입력하세요 : ");
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
			sum += numbers[i];
		}
		
		average = (double) sum / numbers.length;
		
		System.out.println("입력한 정수의 합계 : " + sum);
		System.out.println("입력한 정수의 평균 : " + average);
		
	}

}
