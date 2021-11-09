package ch02;



public class FunctionMainTest2 {

	// main 함수(코드의 시작점)
	public static void main(String[] args) {

		// 함수 사용하는 방법(모양 맞추기)

		double total = addNum(42.123, 10.5);
		System.out.println("total : " + total);

		sayHello("반갑습니다");

		int sum = calcSum();
		System.out.println("sum : " + sum);
		System.out.println("================");
		
		
		int total1 = intAdd(3,5,7); 
		System.out.println("total1 : " + total1);
		
		double total2 = doubleAdd(12.4, 414.2);
		System.out.println("total2 : " + total2);
		
		printArticle("쉬는시간 10분");

	}// end of main

	// 1. 반환값이 없는 함수 설계하기

	public static void sayHello(String greeting) {
		System.out.println(greeting);

	}

	// 2. 매개 변수가 없는 함수 만들기 -> 반환값 있음
	public static int calcSum() {
		int sum = 0;
		int i;
		for (i = 1; i < 101; i++) {
			sum += i;
		}
		return sum;
	}

	// 3. 반환값이 있고 매개변수를 받는 함수 만들기
	public static double addNum(double n1, double n2) {
		double result;
		result = n1 + n2;

		return result;
	}
	
	//함수를 만들어 봅시다
	//4. 리턴값 int, 매개변수 n1,n2,n3, 이름 -> intAdd
	public static int intAdd(int n1,int n2, int n3)
	{
		int result;
		result = n1+n2+n3;
		return result;
	}
	
	
	
	
	//5. 리턴값 double 매개변수 d1,d2 이름 -> doubleAdd
	public static double doubleAdd(double d1, double d2)
	{
		double result;
		result = d1+d2;
		return result;
		
	}
	
	
	//6. 리턴값 없음, 매개변수 String article 이름 ->printArticle
	public static void printArticle(String article) {
		System.out.println(article);
	}

}// end of class
