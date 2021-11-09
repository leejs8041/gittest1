package ch10;

public class Hatchery {
	public static int zerglingCount = 0;
	private int hatcheryId;
	private String name;

	public Hatchery(int id) {
		this.hatcheryId = id;
		name = "해처리";
	}

	public Zergling createZergling() {
		System.out.println("저글링을 생산합니다.");
		zerglingCount++;
		return new Zergling("저글링");

	}

}
