package ch03;



public class OperatorEx1 {

	//main �Լ�(�ڵ��� ����)
	public static void main(String[] args) {
		//1
		//�� ���� ���� ���� �Ͽ� result1 ������ ���
		//����� 30.5�� ����ϼ���.
		
		int i = 10;
		double d = 20.5;
		
		double result1 = i + d;
		System.out.println(result1);
		
		
		//2
		//result1 ������ ���������� ���� �� ��ȯ �ؼ� ����ϼ���
		System.out.println((int)result1);
		
		//3
		//i ������ ���� -1�� �� �� ����ϼ���
		//��,���� ������ ���
		i--;
		System.out.println(i);
		
		//4
		//d ������ ���� -20.5�� ����ϼ���
		//��, d ������ ���� �������� ������
		System.out.println(-d);
		
		
		//5
		//���� i�� d, ���� �����ڸ� ����ؼ� result2 ������
		//�����ϰ� ������ true ���� ��⵵�� ���� �����
		//����ϼ���
		
		boolean result2 = i < d;
		System.out.println(result2);
		
		
		//6
		//���� result3�� �����ϰ�
		//num1�� num2 ������ ���� 50���� ū�� �� �����ڸ� ����ؼ� ����� ��� ����ϼ���
		
		int num1 = 10;
		int num2 = 30;
		boolean result3 = (num1 > 50) || (num2 > 50);
		System.out.println(result3);
		
		//7
		//num1�� num2 �� �� ū ���� ���� �����ڸ� ����ؼ�
		//max ������ ���� ��� ������ּ���
		//��, ����� �ʱ�ȭ�� ���ÿ� ���ּ���.
		int max = (num1 > num2) ? num1 : num2;
		System.out.println("ū ���ڴ� " + max + "�Դϴ�");
		
		
		

	}//end of main

}//end of class
