package Chapter9;

public class Car_1_main {

	public static void main(String[] args) {
		Sedan sd = new Sedan();
		System.out.println("승용차 인스턴스 생성");
		sd.upSpeed(80);
		System.out.println(sd.speed);
	}
}
