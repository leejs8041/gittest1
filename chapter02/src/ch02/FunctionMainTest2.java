package ch02;



public class FunctionMainTest2 {

	// main �Լ�(�ڵ��� ������)
	public static void main(String[] args) {

		// �Լ� ����ϴ� ���(��� ���߱�)

		double total = addNum(42.123, 10.5);
		System.out.println("total : " + total);

		sayHello("�ݰ����ϴ�");

		int sum = calcSum();
		System.out.println("sum : " + sum);
		System.out.println("================");
		
		
		int total1 = intAdd(3,5,7); 
		System.out.println("total1 : " + total1);
		
		double total2 = doubleAdd(12.4, 414.2);
		System.out.println("total2 : " + total2);
		
		printArticle("���½ð� 10��");

	}// end of main

	// 1. ��ȯ���� ���� �Լ� �����ϱ�

	public static void sayHello(String greeting) {
		System.out.println(greeting);

	}

	// 2. �Ű� ������ ���� �Լ� ����� -> ��ȯ�� ����
	public static int calcSum() {
		int sum = 0;
		int i;
		for (i = 1; i < 101; i++) {
			sum += i;
		}
		return sum;
	}

	// 3. ��ȯ���� �ְ� �Ű������� �޴� �Լ� �����
	public static double addNum(double n1, double n2) {
		double result;
		result = n1 + n2;

		return result;
	}
	
	//�Լ��� ����� ���ô�
	//4. ���ϰ� int, �Ű����� n1,n2,n3, �̸� -> intAdd
	public static int intAdd(int n1,int n2, int n3)
	{
		int result;
		result = n1+n2+n3;
		return result;
	}
	
	
	
	
	//5. ���ϰ� double �Ű����� d1,d2 �̸� -> doubleAdd
	public static double doubleAdd(double d1, double d2)
	{
		double result;
		result = d1+d2;
		return result;
		
	}
	
	
	//6. ���ϰ� ����, �Ű����� String article �̸� ->printArticle
	public static void printArticle(String article) {
		System.out.println(article);
	}

}// end of class
