package ch06;

public class MainTest1 {

	public static void main(String[] args) {
		
		Banana banana = new Banana();
		Peach peach = new Peach();
		
		banana.showInfo();
		System.out.println("=============");
		peach.showInfo();
		
		
		//�ڹ��� �پ缺�̶�
		//�θ� Ÿ�� �ν��Ͻ� ������ �ڽ� ��ü�� ������ �� �ִ�.
		Fruit fruit = new Banana(); //�� ĳ����
		
		
		//�θ� �ڽ� ���迡���� ��� �����ϴ�.
		//�� ���� �������� �ʴ´�.
		//�� �ڽ� �ν��Ͻ� ������(��������)�θ� �ν��Ͻ���
		//���� ��ų �� ����.
		//Banana banana2 = new Fruit();
		

	}

}
