package ch03;

public class MainTest7 {

	// main �Լ�(�ڵ��� ����)
	public static void main(String[] args) {

		// ���� ���� ������
		// ���� �����ڿ� �ٸ� �����ڰ� �Բ� ���

		int num1 = 1;
//		num1 = num1 + 10;
		num1 += 10;
		System.out.println(num1);

		int num2 = 1;
		// num2 = num2 -10;
		num2 -= 10;
		System.out.println(num2);

		// num2 ������ ���ϱ� 2�� �ؼ� num2 ���� ������� ����ּ���
		// ��, ���� ���Կ����ڸ� ���

		num2 *= 2;
		// System.out.println(num2);
		num2 = num2 * 2;
		// num2 ������ ������ 2�� �ؼ� num2 ���� ������� ����ּ���
		// ��, ���� ���Կ����ڸ� ���

		num2 /= 2;
		// System.out.println(num2);
		num2 = num2 / 2;

		// num2 ������ ������������ 2�� �ؼ� num2 ���� ������� ����ּ���
		// ��, ���� ���Կ����ڸ� ���
		num2 %= 2;
		// System.out.println(num2);
		num2 = num2 % 2;

	}// end of main

}// end of class
