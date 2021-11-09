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
		System.out.println("===����â===");
		System.out.println("�̸� : " + this.name);
		System.out.println("���ݷ� : " + this.power);
		System.out.println("ü�� : " + this.hp);
		System.out.println("============");
	}

	public void beAttacked(int power) {
		if(this.hp <= 0) {
			System.out.println(name + " �� ����߽��ϴ�.");
		}else {
		this.hp -= power;
		}
	}

	//public void attackZealot(Zealot zealot) {
		//String targetName = zealot.getName();
		//System.out.println(name +" ��(��) " + targetName + " �� ���� �մϴ�.");
		//zealot.beAttacked(this.power);
	//}

	//public void attackMarine(Marine marine) {
		//String targetName = marine.getName();
		//System.out.println(name +" ��(��) " + targetName + " �� ���� �մϴ�.");
		//marine.beAttacked(this.power);
//	}
	public String getName() {
		return name;
	}
	public void attack(Marine marine) {
		String targetName = marine.getName();
		System.out.println(name +" ��(��) " + targetName + " �� ���� �մϴ�.");
		marine.beAttacked(this.power);
		
	}
	public void attack(Zealot zealot) {
		String targetName = zealot.getName();
		System.out.println(name +" ��(��) " + targetName + " �� ���� �մϴ�.");
		zealot.beAttacked(this.power);
	}
}
