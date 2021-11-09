package ch10;

public class Marine {

	private int hp;
	private int power;
	private String name;

	public Marine(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 50;
	}

	public void showInfo() {
		System.out.println("===����â===");
		System.out.println("�̸� : " + this.name);
		System.out.println("���ݷ� : " + this.power);
		System.out.println("ü�� : " + this.hp);
		System.out.println("==========");
	}

	// ���� ���մϴ�.
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

	//public void attackZergling(Zergling zergling) {
		//String targetName = zergling.getName();
		//System.out.println(name +" ��(��) " + targetName + " �� ���� �մϴ�.");
		//zergling.beAttacked(this.power);
	//}

	public String getName() {
		return name;
	}
	public void attack(Zergling zergling) {
		String targetName = zergling.getName();
		System.out.println(name +" ��(��) " + targetName + " �� ���� �մϴ�.");
		zergling.beAttacked(this.power);
		
	}
	public void attack(Zealot zealot) {
		String targetName = zealot.getName();
		System.out.println(name +" ��(��) " + targetName + " �� ���� �մϴ�.");
		zealot.beAttacked(this.power);
	}
	

}
