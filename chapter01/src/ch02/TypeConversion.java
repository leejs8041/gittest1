package ch02;

public class TypeConversion {

	// main함수(코드의 시작점)
	public static void main(String[] args) {
		// 데이터 형 변환
		// int 자료형을 double로 변경하거나
		// double 자료형을 int 변경하는 것을 말합니다.
		int iNUM1 = 100;
		System.out.println(iNUM1);

		// 자동 형변화
		double dNUM1 = iNUM1;
		System.out.println(dNUM1);

		// 강제 형변화
		double dNumber = 1.12345;
//		int iNumber = dNumber;

		// 개발자가 컴파일러야 괜찮으니깐 그냥 강제로 넣어
		int iNumber = (int) dNumber;
		System.out.println(iNumber);
		
		
		//연습 
		double aValue;
		int bValue;
		
		aValue = 0.5;
		bValue = (int)10.1;
		System.out.println(bValue);
	}// end of main

}// end of class
