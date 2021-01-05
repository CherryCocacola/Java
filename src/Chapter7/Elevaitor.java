package Chapter7;

public class Elevaitor {
	static int floor = 0;

	public Elevaitor (int floor) {
		this.floor = floor;
	}
	
	public static void up(int up) {
		floor = up;
		System.out.println(floor +" 층에 도착하였습니다.");
	}
	
	public static void down() {
	}
}
