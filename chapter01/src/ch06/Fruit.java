package ch06;

public class Fruit {
	
	String name;
	int price;
	int fresh;
	
	public void showInfo() {
		System.out.println("==================");
		System.out.println("name : " + name);
		System.out.println("가격 : " + price);
		System.out.println("신선도 : " + fresh);
		System.out.println("==================");
	}

}
