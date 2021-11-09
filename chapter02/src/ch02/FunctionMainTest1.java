package ch02;



public class FunctionMainTest1 {

	//main함수(코드의 시작점)
	public static void main(String[] args) {
		
		//함수 사용 방법(모양 맞추기)
		int addResult1 = add(10, 77);
		System.out.println(addResult1);
		
		int addResult2 = add(24,124);
		System.out.println(addResult2);
		

	}//end of main
	
	//add 함수를 생성
	public static int add(int num1, int num2)
	{
		
		int result;
		result = num1 + num2;
		return result;
		
		
	}

}//end of class
