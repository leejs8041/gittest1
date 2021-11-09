package ch05;


public class Hero {
	
	String name;
	int hp;
	
	public Hero(String name, int hp) {
		this.hp = hp;
		this.name = name;
	}
	
	public void attack() {
		System.out.println("기본공격");
	}
	
	

}
