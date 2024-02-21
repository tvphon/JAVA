package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
		public static void method1() {
			Scanner sc = new Scanner(System.in);

			System.out.print("이름을 입력하세요 : ");
			String name = sc.next();

			System.out.print("성별을 입력하세요(남자/여자) : ");
			String gender = sc.next();

			System.out.print("나이를 입력하세요 : ");
			int age = sc.nextInt();

			System.out.print("키를 입력하세요 : ");
			double height = sc.nextDouble();

			System.out.println("\n" + "키 " + height + "cm인 " + age + "살 " + gender + "자 " + name + "님 반갑습니다 ^^");

		}
	

}
