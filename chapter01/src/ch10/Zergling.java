package ch10;

public class Zergling {

	private int power;
	private int hp;
	private String name;

	public Zergling(String name) {
		this.name = name;
		this.hp = 50;
		this.power = 5;
	}

	public void ShowInfo() {
		System.out.println("===정보창===");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("체력 : " + this.hp);
		System.out.println("============");
	}

	public void beAttacked(int power) {
		if(this.hp <= 0) {
			System.out.println(name + " 이 사망했습니다.");
		}else {
		this.hp -= power;
		}
	}

	//public void attackZealot(Zealot zealot) {
		//String targetName = zealot.getName();
		//System.out.println(name +" 이(가) " + targetName + " 을 공격 합니다.");
		//zealot.beAttacked(this.power);
	//}

	//public void attackMarine(Marine marine) {
		//String targetName = marine.getName();
		//System.out.println(name +" 이(가) " + targetName + " 을 공격 합니다.");
		//marine.beAttacked(this.power);
//	}
	public String getName() {
		return name;
	}
	public void attack(Marine marine) {
		String targetName = marine.getName();
		System.out.println(name +" 이(가) " + targetName + " 을 공격 합니다.");
		marine.beAttacked(this.power);
		
	}
	public void attack(Zealot zealot) {
		String targetName = zealot.getName();
		System.out.println(name +" 이(가) " + targetName + " 을 공격 합니다.");
		zealot.beAttacked(this.power);
	}
}
