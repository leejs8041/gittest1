package ch10;

public class MainTest1 {

	// �����Լ�(�ڵ��� ����)
	public static void main(String[] args) {

		Zealot zealot1 = new Zealot("����1");
		Zealot zealot2 = new Zealot("����2");
		Marine marine1 = new Marine("����1");
		Marine marine2 = new Marine("����2");
		Zergling zergling1 = new Zergling("���۸�1");
		Zergling zergling2 = new Zergling("���۸�2");

		zealot1.attack(marine1);
		zealot1.attack(marine1);
		zealot1.attack(marine1);
		zealot1.attack(marine1);
		zealot1.attack(marine1);
		zealot1.attack(marine1);
		marine1.showInfo();

		//
		/*
		 * System.out.println("=================="); System.out.println("������");
		 * System.out.println(1); System.out.println(0.5); System.out.println('A');
		 */

	}// end of main

}// end of class
