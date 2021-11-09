package ch10;

public class MainTest1 {

	// 메인함수(코드의 시작)
	public static void main(String[] args) {

		Zealot zealot1 = new Zealot("질럿1");
		Zealot zealot2 = new Zealot("질럿2");
		Marine marine1 = new Marine("마린1");
		Marine marine2 = new Marine("마린2");
		Zergling zergling1 = new Zergling("저글링1");
		Zergling zergling2 = new Zergling("저글링2");

		zealot1.attack(marine1);
		zealot1.attack(marine1);
		zealot1.attack(marine1);
		zealot1.attack(marine1);
		zealot1.attack(marine1);
		zealot1.attack(marine1);
		marine1.showInfo();

		//
		/*
		 * System.out.println("=================="); System.out.println("가나다");
		 * System.out.println(1); System.out.println(0.5); System.out.println('A');
		 */

	}// end of main

}// end of class
