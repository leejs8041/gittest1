package ch03;

public class MainTest5 {

	// main�Լ�(�ڵ��� ����)
	public static void main(String[] args) {

		// �� ������(&&, ||)���ۼ�Ʈ, ��Ƽ�� ��
		// ���� �����ڿ� ȥ���Ͽ� ���� ����
		// ���꿡 ����� true, false

		int num1 = 10;
		int num2 = 20;

		// 1. ���� (&&)
		//
		boolean flag1 = (num1 > 0) && (num2 > 0);
		System.out.println(flag1);

		boolean flag2 = (num1 > 0) && (num2 < 0);
		System.out.println(flag2);
		// �Ѵ� true(��) �� ��, true�� ��ȯ

		// 2. ����(||)
		//
		boolean flag3 = (num1 < 0) || (num2 > 0);
		System.out.println(flag3);
		boolean flag4 = (num1 > 0) || (num2 > 0);
		System.out.println(flag4);
		// �� �� true(��) �� ��, true�� ��ȯ

		System.out.println("===========================");
		
		//num1 = 10
		boolean flag5 = (num1 < 0) && (num2 > 0);
		System.out.println(flag5);
		
		boolean flag6 = (num1 > 0) || (num2 > 0);
		System.out.println(flag6);
		System.out.println("===========================");
		

	}// end of main

}// end of class
