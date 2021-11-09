package ch05;

public class MainTest1 {

	public static void main(String[] args) {
		
		Warrior warrior1 = new Warrior("전사", 100);
		Archer archer1 = new Archer("궁수", 100);
		Wizard wizard1 = new Wizard("마법사", 80);
		
		
		String name = warrior1.name;
		int hp = warrior1.hp;
		warrior1.attack();
		warrior1.comboAttack();
		
		
		String name1 = archer1.name;
		int hp1 = archer1.hp;
		archer1.attack();
		archer1.fireArrow();
		
		
		String name2 = wizard1.name;
		int hp2 = wizard1.hp;
		wizard1.attack();
		wizard1.freezing();
				
		
	}

}
