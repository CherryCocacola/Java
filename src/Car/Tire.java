package Car;

public class Tire {
	public int maxRotation;  //타이어 한계 회전
	public int accumulatedRotation;   // 타이어 적산 회전
	public String location;  //타이어 위치

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() {
		accumulatedRotation++;
		if (accumulatedRotation < maxRotation) {   //1  <  2
			System.out.println(location + " Tire 수명: " + (maxRotation - accumulatedRotation) + "회");  //1
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}
