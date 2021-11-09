package ch03;

public class MainTest5 {

	// main함수(코드의 시작)
	public static void main(String[] args) {

		// 논리 연산자(&&, ||)엠퍼센트, 버티컬 바
		// 관계 연산자와 혼합하여 많이 사용됨
		// 연산에 결과가 true, false

		int num1 = 10;
		int num2 = 20;

		// 1. 논리곱 (&&)
		//
		boolean flag1 = (num1 > 0) && (num2 > 0);
		System.out.println(flag1);

		boolean flag2 = (num1 > 0) && (num2 < 0);
		System.out.println(flag2);
		// 둘다 true(참) 일 때, true를 반환

		// 2. 논리합(||)
		//
		boolean flag3 = (num1 < 0) || (num2 > 0);
		System.out.println(flag3);
		boolean flag4 = (num1 > 0) || (num2 > 0);
		System.out.println(flag4);
		// 한 쪽 true(참) 일 때, true를 반환

		System.out.println("===========================");
		
		//num1 = 10
		boolean flag5 = (num1 < 0) && (num2 > 0);
		System.out.println(flag5);
		
		boolean flag6 = (num1 > 0) || (num2 > 0);
		System.out.println(flag6);
		System.out.println("===========================");
		

	}// end of main

}// end of class
