package ch03;

public class MainTest1 {

	// main�Լ�(�ڵ��� ������)
	public static void main(String[] args) {
		
		// ���� ����� (=)
		int number = 10;
		// =(���б�ȣ�� �޸� ������ ���� �����ϴ� ������ �Դϴ�)
		// ���꿡 ������ �����ʿ��� �������� ������ �˴ϴ�.
		
		int number2 = number;
		// ������ ������ ������ ���� �ֽ��ϴ�. 
		
		System.out.println(number);
		System.out.println(number2);
		System.out.println("======================");
		
		//��ȣ ������(+, -)
		//��ȣ�� �����ϴ� ������ �Դϴ�.
		//�� ������ ��� �ִ� ���� ���� ������ ���´� �ƴմϴ�.
		
		System.out.println(-number);
		System.out.println("number�� ���� �� : " + number);
		
		number = -number;
		System.out.println(number);
		//������ ���� ���� �����Ϸ��� ���� �����ڸ� �Բ� ����ؾ��Ѵ�. 
		
		
		
		
		
	}// end of main

}// end of class