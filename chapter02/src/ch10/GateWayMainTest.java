package ch10;

public class GateWayMainTest {

	//main 함수(코드의 시작)
	public static void main(String[] args) {
		
		
		
		
		
		GateWay gateway1 = new GateWay(1);
		GateWay gateway2 = new GateWay(1);
		GateWay gateway3 = new GateWay(1);
		
		
		Zealot zealot1 = gateway1.createZealot();
		Zealot zealot2 = gateway1.createZealot();
		Zealot zealot3 = gateway1.createZealot();
		Zealot zealot4 = gateway1.createZealot();
		Zealot zealot5 = gateway1.createZealot();
		Zealot zealot6 = gateway1.createZealot();
		Zealot zealot7 = gateway1.createZealot();
		Zealot zealot8 = gateway1.createZealot();
		Zealot zealot9 = gateway1.createZealot();
		
		
		gateway2.createZealot();
		gateway2.createZealot();
		gateway2.createZealot();
		gateway2.createZealot();

		gateway3.createZealot();
		gateway3.createZealot();
		gateway3.createZealot();
		gateway3.createZealot();
		gateway3.createZealot();
		
		
		zealot1.showInfo();
		
		
		//static 변수는 인스턴스들이 공유할 수 있는 변수이다.
		//-->객체를 생성하지 않고도 클래스르 이름으로 접근이 가능하다.
		//ex)태양(객체가 생성되기 전에 메모리에 올라가 있다)
		
		System.out.println("현재 생성된 질럿 수 : " + GateWay.zealotCount);
		
		
	}//end of main

}//end of class
