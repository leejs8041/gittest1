package ch02;

public class TypeConversion {

	// main�Լ�(�ڵ��� ������)
	public static void main(String[] args) {
		// ������ �� ��ȯ
		// int �ڷ����� double�� �����ϰų�
		// double �ڷ����� int �����ϴ� ���� ���մϴ�.
		int iNUM1 = 100;
		System.out.println(iNUM1);

		// �ڵ� ����ȭ
		double dNUM1 = iNUM1;
		System.out.println(dNUM1);

		// ���� ����ȭ
		double dNumber = 1.12345;
//		int iNumber = dNumber;

		// �����ڰ� �����Ϸ��� �������ϱ� �׳� ������ �־�
		int iNumber = (int) dNumber;
		System.out.println(iNumber);
		
		
		//���� 
		double aValue;
		int bValue;
		
		aValue = 0.5;
		bValue = (int)10.1;
		System.out.println(bValue);
	}// end of main

}// end of class
