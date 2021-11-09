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
		System.out.println("===정보창===");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("체력 : " + this.hp);
		System.out.println("==========");
	}

	// 공격 당합니다.
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

	//public void attackZergling(Zergling zergling) {
		//String targetName = zergling.getName();
		//System.out.println(name +" 이(가) " + targetName + " 을 공격 합니다.");
		//zergling.beAttacked(this.power);
	//}

	public String getName() {
		return name;
	}
	public void attack(Zergling zergling) {
		String targetName = zergling.getName();
		System.out.println(name +" 이(가) " + targetName + " 을 공격 합니다.");
		zergling.beAttacked(this.power);
		
	}
	public void attack(Zealot zealot) {
		String targetName = zealot.getName();
		System.out.println(name +" 이(가) " + targetName + " 을 공격 합니다.");
		zealot.beAttacked(this.power);
	}
	

}
