package ch10;

public class HatcheryMainTest {

	public static void main(String[] args) {
		
		Hatchery hatchery1 = new Hatchery(1);
		Hatchery hatchery2 = new Hatchery(1);
		Hatchery hatchery3 = new Hatchery(1);
		
		
		hatchery1.createZergling();
		hatchery1.createZergling();
		hatchery1.createZergling();
		
		
		hatchery2.createZergling();
		hatchery2.createZergling();
		hatchery2.createZergling();
		
		
		hatchery3.createZergling();
		hatchery3.createZergling();
		hatchery3.createZergling();
		
		
		System.out.println("현재 생성된 저글링 수 : " + Hatchery.zerglingCount);
		
		

	}

}
